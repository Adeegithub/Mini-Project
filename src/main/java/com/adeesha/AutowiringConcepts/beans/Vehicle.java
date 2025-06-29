package com.adeesha.AutowiringConcepts.beans;

import com.adeesha.AutowiringConcepts.service.VehicleService;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component(value = "VehicleBean")
public class Vehicle {
    private String make = "Toyota";
    private String model = "Axio";
    private int topSpeed = 280;

    private final VehicleService vehicleService;

    public Vehicle(VehicleService vehicleService) {
       this.vehicleService = vehicleService;
    }
}
