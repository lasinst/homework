package com.bridge.interview.laszlo.service;

public class BarbequeResponse {
    boolean goodToBarbeque;
    float temp;
    float chance;

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void setChance(float chance) {
        this.chance = chance;
    }

    public void setGoodToBarbeque(boolean b) {
        this.goodToBarbeque = b;
    }

    public boolean isGoodToBarbeque() {
        return goodToBarbeque;
    }

    public float getTemp() {
        return temp;
    }

    public float getChance() {
        return chance;
    }
}
