package com.smarthome;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class SmartHomeSystemTest {

    private SmartHomeController controller;
    private Light light;
    private Fan fan;
    private AirConditioner ac;

    @BeforeEach
    public void setup() {
        controller = new SmartHomeController();
        light = new Light();
        fan = new Fan();
        ac = new AirConditioner();

        controller.registerAppliance(light);
        controller.registerAppliance(fan);
        controller.registerAppliance(ac);
    }

    @Test
    public void testApplianceTurnOnAndOff() {
        light.turnOn();
        fan.turnOn();
        ac.turnOn();

        assertTrue(light.isOn());
        assertTrue(fan.isOn());
        assertTrue(ac.isOn());

        light.turnOff();
        fan.turnOff();
        ac.turnOff();

        assertFalse(light.isOn());
        assertFalse(fan.isOn());
        assertFalse(ac.isOn());
    }

    @Test
    public void testFanSpeedOnOff() {
        fan.turnOn();
        assertEquals(1, fan.getSpeed());
        fan.turnOff();
        assertEquals(0, fan.getSpeed());
    }

    @Test
    public void testAirConditionerMode() {
        ac.turnOn();
        assertEquals("cool", ac.getMode());
        ac.turnOff();
        assertEquals("off", ac.getMode());
    }

    @Test
    public void testYearlyUpdateTurnsEverythingOff() {
        light.turnOn();
        fan.turnOn();
        ac.turnOn();

        LocalDateTime updateTime = LocalDateTime.of(2025, 1, 1, 1, 0);
        controller.performYearlyUpdate(updateTime);

        assertFalse(light.isOn());
        assertFalse(fan.isOn());
        assertFalse(ac.isOn());
    }

    @Test
    public void testYearlyUpdateDoesNothingOutsideUpdateTime() {
        light.turnOn();
        fan.turnOn();
        ac.turnOn();

        LocalDateTime nonUpdateTime = LocalDateTime.of(2025, 6, 1, 1, 0);
        controller.performYearlyUpdate(nonUpdateTime);

        assertTrue(light.isOn());
        assertTrue(fan.isOn());
        assertTrue(ac.isOn());
    }
}

