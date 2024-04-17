package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example7 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle volkswagen = new Vehicle();
        volkswagen.setName("Volkswagen");
        Supplier<Vehicle>vehicleSupplier = () -> volkswagen;

        Supplier<Vehicle>audiSupplier = () -> {
            Vehicle audi = new Vehicle();
            audi.setName("audi");
            return audi;
        };

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("randomn number is "+ randomNumber);
        if(randomNumber%2==0){
            context.registerBean("Volkswagen", Vehicle.class,vehicleSupplier);
        }
        else{
            context.registerBean("audi", Vehicle.class,audiSupplier);
        }

        Vehicle volk = null;
        Vehicle audi = null;
        try {
            volk = context.getBean("Volkswagen", Vehicle.class);
            System.out.println(volk.getName());
        } catch (Exception e){
            System.out.println("Error while creating Volk");
        }

        try {
            audi = context.getBean("audi", Vehicle.class);
            System.out.println(audi.getName());
        } catch (Exception e){
            System.out.println("Error while creating audi");
        }


    }
}
