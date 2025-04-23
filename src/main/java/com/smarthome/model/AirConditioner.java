package com.smarthome.model;

import java.util.List;

public class AirConditioner implements Appliance {
    private String mode = "off"; // e.g., "cool", "heat", "fan", "off"

    @Override
    public void turnOn() {
        mode = "cool"; // default
    }

    @Override
    public void turnOff() {
        mode = "off";
    }

    public void setMode(String mode) {
        if (!List.of("off", "cool", "heat", "fan").contains(mode.toLowerCase())) {
            throw new IllegalArgumentException("Invalid mode.");
        }
        this.mode = mode.toLowerCase();
    }

    @Override
    public String getStatus() {
        return "Mode: " + mode;
    }
}

