package com.example.service;

import com.example.interfaces.Speaker;
import com.example.interfaces.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {
    private Speaker speaker;
    private Tyre tyre;


    public void playMusic(){
        System.out.println(speaker.playMusic());
    }

    public void move(){
        System.out.println(tyre.move());
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    @Autowired
    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public Tyre getTyre() {
        return tyre;
    }

    @Autowired
    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }
}
