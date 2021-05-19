package com.bridge.interview.laszlo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Current {
    public Current(){}
    public float temp;
    public Rain rain;

    public float getTemp(){
        return temp;
    }

    public Rain getRain(){
        return rain;
    }

    @Override
    public String toString() {
        return "Current{" +
                "temp=" + temp +
                ", rain=" + rain +
                '}';
    }
}
