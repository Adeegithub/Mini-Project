package com.adeesha.AutowiringConcepts.impl;

import com.adeesha.AutowiringConcepts.interfaces.Speaker;
import org.springframework.stereotype.Component;

@Component
public class SonySpeakers implements Speaker {
    @Override
    public String playMusic() {
        return "Playing music from Sony Speakers";
    }
}
