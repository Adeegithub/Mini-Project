package com.adeesha.AutowiringConcepts.impl;

import com.adeesha.AutowiringConcepts.interfaces.Tyre;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyre {
    @Override
    public String rotate() {
        return "Tyres are rotating with BridgeStone Tyres";
    }
}
