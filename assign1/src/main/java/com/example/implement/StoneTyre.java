package com.example.implement;

import com.example.interfaces.Tyre;
import org.springframework.stereotype.Component;

@Component
public class StoneTyre implements Tyre {
    @Override
    public String move() {
        return "Moving with Stone";
    }
}
