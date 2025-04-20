package com.smarthome;

class AirConditioner implements Appliance {
    private String mode = "off"; // "off", "cool", "heat"

    @Override
    public void turnOn() {
        mode = "cool";
    }

    @Override
    public void turnOff() {
        mode = "off";
    }

    @Override
    public boolean isOn() {
        return !"off".equals(mode);
    }

    public String getMode() {
        return mode;
    }
}

