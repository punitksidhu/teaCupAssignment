package com.smarthome.model;

public class Light implements Appliance {
    private boolean isOn = false;

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public String getStatus() {
        return isOn ? "ON" : "OFF";
    }
}



