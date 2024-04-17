package com.example.beans;

import com.example.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "Vehicle")
public class Vehicle {

    private VehicleService service;
    private String name = "Honda";

    public VehicleService getService() {
        return service;
    }

    @Autowired
    public void setService(VehicleService service) {
        this.service = service;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
