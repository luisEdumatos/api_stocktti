package com.hardwareinventory.stocktti.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hardware")
public class HardwareController {

    @GetMapping
    public String getListHardware() {
        return "API Test!";
    }
}
