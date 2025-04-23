package com.smarthome;

import com.smarthome.model.Appliance;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

class SmartHomeController {
    private List<Appliance> appliances = new ArrayList<>();

    public void registerAppliance(Appliance appliance) {
        appliances.add(appliance);
    }

    public void turnOffAll() {
        for (Appliance appliance : appliances) {
            appliance.turnOff();
        }
    }

    public void performYearlyUpdate(LocalDateTime now) {
        if (now.getMonth() == Month.JANUARY && now.getDayOfMonth() == 1 &&
                now.getHour() == 1 && now.getMinute() == 0) {
            turnOffAll();
            System.out.println("Yearly system update is done. All appliances turned off.");
        }
    }

    public List<Appliance> getAppliances() {
        return appliances;
    }
}
