package com.example.implement;

import com.example.interfaces.Speaker;
import org.springframework.stereotype.Component;

@Component
public class SonySpeaker implements Speaker {
    @Override
    public String playMusic() {
        return "Sony playing music";
    }
}
