package com.smarthome.service;

import com.smarthome.model.AirConditioner;
import com.smarthome.model.Fan;
import com.smarthome.model.Light;
import org.springframework.stereotype.Service;

@Service
public class ApplianceService {
    private final Light light = new Light();
    private final Fan fan = new Fan();
    private final AirConditioner ac = new AirConditioner();

    public void turnOffAll() {
        light.turnOff();
        fan.turnOff();
        ac.turnOff();
    }

    public Light getLight() { return light; }
    public Fan getFan() { return fan; }
    public AirConditioner getAc() { return ac; }
}
