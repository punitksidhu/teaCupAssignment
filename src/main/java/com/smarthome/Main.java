package com.smarthome;

import com.smarthome.model.AirConditioner;
import com.smarthome.model.Fan;
import com.smarthome.model.Light;

import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Light light = new Light();
        Fan fan = new Fan();
        AirConditioner ac = new AirConditioner();

//        // Create smart home controller
//        SmartHomeController controller = new SmartHomeController();
//
//        // Register appliances
//        controller.registerAppliance(light);
//        controller.registerAppliance(fan);
//        controller.registerAppliance(ac);
//
//        // Turn appliances on
//        light.turnOn();
//        fan.turnOn();
//        ac.turnOn();

//        System.out.println("All appliances turned ON:");
//        System.out.println("Light is on? " + light.isOn());
//        System.out.println("Is the Fan on? " + fan.isOn() + " (Speed: " + fan.getSpeed() + ")");
//        System.out.println("Is the AC on? " + ac.isOn() + " (Mode: " + ac.getMode() + ")");
//
//        // Simulate yearly update time
//        LocalDateTime updateTime = LocalDateTime.of(2025, 1, 1, 1, 0);
//        controller.performYearlyUpdate(updateTime);
//
//        // Show status after update
//        System.out.println("\nAfter the Yearly Update is done :");
//        System.out.println("Light is on? " + light.isOn());
//        System.out.println("Fan is on? " + fan.isOn());
//        System.out.println("AC is on? " + ac.isOn());

    }
}