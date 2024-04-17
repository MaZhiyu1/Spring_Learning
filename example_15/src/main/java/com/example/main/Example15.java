package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import com.example.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.net.SocketOption;

public class Example15 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before retrieving the Person bean from Spring context");
        Person person = context.getBean("personBean", Person.class);
        System.out.println("After retrieving the Person bean from Spring context");

    }
}
