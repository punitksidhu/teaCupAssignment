package com.smarthome;

import com.smarthome.service.ApplianceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class UpdateScheduler {

    @Autowired
    private ApplianceService service;

    @Scheduled(cron = "0 0 1 1 1 *", zone = "Your/Timezone")
    public void yearlyUpdate() {
        service.turnOffAll();
        System.out.println("Yearly update: All appliances turned off.");
    }
}
