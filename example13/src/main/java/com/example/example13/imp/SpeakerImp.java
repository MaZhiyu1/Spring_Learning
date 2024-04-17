package com.example.example13.imp;

import com.example.example13.inter.Speaker;

public class SpeakerImp {

    public class Sony implements Speaker {
        @Override
        public void playMusic() {
            System.out.println("Playing music with Sony");
        }
    }

    public class Bose implements Speaker{
        @Override
        public void playMusic() {
            System.out.println("Playing music with Bose");
        }
    }

    public Sony chooseSony(){
        Sony sony = new Sony();
        return sony;
    }

    public Bose chooseBose(){
        Bose bose = new Bose();
        return bose;
    }

}
