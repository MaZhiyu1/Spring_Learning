package com.example.implement;

import com.example.interfaces.Tyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MiliTyre implements Tyre {
    @Override
    public String move() {
        return "Moving with MiliTyre";
    }
}
