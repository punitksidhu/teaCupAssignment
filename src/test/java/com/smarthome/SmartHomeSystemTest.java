package com.smarthome;
import com.smarthome.model.AirConditioner;
import com.smarthome.model.Fan;
import com.smarthome.model.Light;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;


public class SmartHomeSystemTest {


    @Test
    void testValidFanSpeed() {
        Fan fan = new Fan();
        fan.setSpeed(2);
        assertEquals("Speed: 2", fan.getStatus());
    }

    @Test
    void testInvalidFanSpeed() {
        Fan fan = new Fan();
        assertThrows(IllegalArgumentException.class, () -> fan.setSpeed(3));
    }

    @Test
    void testFanTurnOff() {
        Fan fan = new Fan();
        fan.turnOn();
        fan.turnOff();
        assertEquals("Speed: 0", fan.getStatus());
    }
}





