package com.smarthome.model;

public class Fan implements Appliance {
    private int speed = 0; // 0 = OFF, 1 = LOW, 2 = HIGH

    @Override
    public void turnOn() {
        speed = 1;
    }

    @Override
    public void turnOff() {
        speed = 0;
    }

    public void setSpeed(int speed) {
        if (speed < 0 || speed > 2) throw new IllegalArgumentException("Speed must be 0, 1, or 2.");
        this.speed = speed;
    }

    @Override
    public String getStatus() {
        return "Speed: " + speed;
    }
}
