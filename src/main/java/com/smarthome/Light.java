package com.smarthome;

class Light implements Appliance {
    private boolean switchPosition = false; // false = off, true = on

    @Override
    public void turnOn() {
        switchPosition = true;
    }

    @Override
    public void turnOff() {
        switchPosition = false;
    }

    @Override
    public boolean isOn() {
        return switchPosition;
    }
}

