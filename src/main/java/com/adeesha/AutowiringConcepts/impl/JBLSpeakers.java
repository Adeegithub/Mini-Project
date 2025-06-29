package com.adeesha.AutowiringConcepts.impl;

import com.adeesha.AutowiringConcepts.interfaces.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JBLSpeakers implements Speaker {
    @Override
    public String playMusic() {
        return "Playing music from JBL Speakers";
    }
}
