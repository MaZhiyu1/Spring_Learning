package com.example.implement;

import com.example.interfaces.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoseSpeaker implements Speaker {
    @Override
    public String playMusic() {
        return "Bose Playing music";
    }
}
