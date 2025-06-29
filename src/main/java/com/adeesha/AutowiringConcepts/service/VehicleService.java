package com.adeesha.AutowiringConcepts.service;

import com.adeesha.AutowiringConcepts.interfaces.Speaker;
import com.adeesha.AutowiringConcepts.interfaces.Tyre;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class VehicleService {

    //Field Injection
    @Autowired
    private Speaker speaker;

    @Autowired
    private Tyre tyre;


    public void playMusic() {
        String result = speaker.playMusic();
        System.out.println(result);
    }

    public void moveVehicle() {
        String result = tyre.rotate();
        System.out.println(result);
    }
}