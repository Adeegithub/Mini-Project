package com.adeesha.AutowiringConcepts.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component(value = "PersonBean")
public class Person {
    private String name = "Adeesha";
    private int age = 28;

    private final Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}