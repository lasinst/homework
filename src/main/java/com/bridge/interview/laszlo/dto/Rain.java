package com.bridge.interview.laszlo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain {
    @JsonProperty("1h")
    public float chance;

    public float getChance(){
        return chance;
    }

    @Override
    public String toString() {
        return "Rain{" +
                "chance=" + chance +
                '}';
    }
}
