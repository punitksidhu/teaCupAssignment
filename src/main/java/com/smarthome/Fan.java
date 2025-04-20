package com.smarthome;

class Fan implements Appliance {
    private int speed = 0; // 0 = off, 1 or 2 = on

    @Override
    public void turnOn() {
        speed = 1;
    }

    @Override
    public void turnOff() {
        speed = 0;
    }

    @Override
    public boolean isOn() {
        return speed > 0;
    }

    public int getSpeed() {
        return speed;
    }
}

