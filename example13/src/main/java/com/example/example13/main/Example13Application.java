package com.example.example13.main;

import com.example.example13.beans.Person;
import com.example.example13.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Example13Application {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(Config.class);
        Person person = context.getBean(Person.class);
        System.out.println("Person name from Spring Context is: " + person.getName());
        person.getVehicle().getSpeakerImp().chooseBose().playMusic();
        person.getVehicle().getTyresImp().chooseMichelin().move();
    }

}
