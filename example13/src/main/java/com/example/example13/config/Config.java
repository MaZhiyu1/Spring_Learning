package com.example.example13.config;


import com.example.example13.beans.Vehicle;
import com.example.example13.imp.SpeakerImp;
import com.example.example13.imp.TyresImp;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.example13.beans")

public class Config {

    @Bean
    Vehicle vehicle1(@Qualifier("speaker") SpeakerImp speakerImp, @Qualifier("tyres") TyresImp tyresImp){
        var veh = new Vehicle(speakerImp,tyresImp);
        veh.setName("Audi");
        return veh;
    }

    @Bean
    Vehicle vehicle2(@Qualifier("speaker") SpeakerImp speakerImp, @Qualifier("tyres") TyresImp tyresImp){
        var veh = new Vehicle(speakerImp,tyresImp);
        veh.setName("Honda");
        return veh;
    }

    @Bean
    SpeakerImp speaker(){
        return new SpeakerImp();
    }

    @Bean
    TyresImp tyres(){
        return new TyresImp();
    }



}
