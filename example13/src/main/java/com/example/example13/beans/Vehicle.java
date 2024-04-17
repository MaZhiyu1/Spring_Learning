package com.example.example13.beans;


import com.example.example13.imp.SpeakerImp;
import com.example.example13.imp.TyresImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    String name;


    final SpeakerImp speakerImp;
    final TyresImp tyresImp;

    @Autowired
    public Vehicle(@Qualifier("speaker") SpeakerImp speakerImp, @Qualifier("tyres") TyresImp tyresImp) {
        this.speakerImp = speakerImp;
        this.tyresImp = tyresImp;
    }

    public SpeakerImp getSpeakerImp() {
        return speakerImp;
    }

    public TyresImp getTyresImp() {
        return tyresImp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





}
