package com.bridge.interview.laszlo.controller;

import com.bridge.interview.laszlo.service.BarbequeResponse;
import com.bridge.interview.laszlo.service.BarbequeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BarbequeController {

    @GetMapping("/barbeque")
    public String goodToBarbeque() {
        BarbequeResponse goodToBarbeque = new BarbequeService().goodToBarbeque();
        String stats = "Temp:" + goodToBarbeque.getTemp() + "C - Chance of rain:" + goodToBarbeque.getChance()*100 + "%";
        if (goodToBarbeque.isGoodToBarbeque())
            return "BARBEQUE TIME! " + stats;
        else
            return "NO BARBEQUE NOW! " + stats;
    }
}
