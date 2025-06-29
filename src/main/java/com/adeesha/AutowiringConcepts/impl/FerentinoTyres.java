package com.adeesha.AutowiringConcepts.impl;

import com.adeesha.AutowiringConcepts.interfaces.Tyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FerentinoTyres implements Tyre {
    @Override
    public String rotate() {
        return "Tyres are rotating with Ferentino Tyres";
    }
}
