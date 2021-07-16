package com.hardwareinventory.stocktti.controller;

import com.hardwareinventory.stocktti.dto.MessageResponseDTO;
import com.hardwareinventory.stocktti.entity.Hardware;
import com.hardwareinventory.stocktti.service.HardwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/hardware")
public class HardwareController {

    private HardwareService hardwareService;

    @Autowired
    public HardwareController(HardwareService hardwareService) {
        this.hardwareService = hardwareService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createHardware(@RequestBody Hardware hardware) {
        return hardwareService.createHardware(hardware);
    }
}
