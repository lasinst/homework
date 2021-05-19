package com.bridge.interview.laszlo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

    public Weather(){}
    public Current current;

    public Current getCurrent(){
        return current;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "current=" + current +
                '}';
    }
}
