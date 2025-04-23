package com.smarthome;

import com.smarthome.service.ApplianceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplianceController {

    @Autowired
    private ApplianceService service;

    @PostMapping("/light/on")
    public ResponseEntity<?> lightOn() {
        service.getLight().turnOn();
        return ResponseEntity.ok("Light turned on");
    }

    @PostMapping("/light/off")
    public ResponseEntity<?> lightOff() {
        service.getLight().turnOff();
        return ResponseEntity.ok("Light turned off");
    }

    @PostMapping("/fan/speed/{speed}")
    public ResponseEntity<?> setFanSpeed(@PathVariable int speed) {
        try {
            service.getFan().setSpeed(speed);
            return ResponseEntity.ok("Fan speed set to " + speed);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/ac/mode/{mode}")
    public ResponseEntity<?> setAcMode(@PathVariable String mode) {
        try {
            service.getAc().setMode(mode);
            return ResponseEntity.ok("AC mode set to " + mode);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/update")
    public ResponseEntity<?> performUpdate() {
        service.turnOffAll();
        return ResponseEntity.ok("System update complete, all appliances turned off");
    }
}