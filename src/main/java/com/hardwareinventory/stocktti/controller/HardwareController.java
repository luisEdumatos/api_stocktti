package com.hardwareinventory.stocktti.controller;

import com.hardwareinventory.stocktti.dto.request.HardwareDTO;
import com.hardwareinventory.stocktti.dto.response.MessageResponseDTO;
import com.hardwareinventory.stocktti.entity.Hardware;
import com.hardwareinventory.stocktti.exception.HardwareNotFoundException;
import com.hardwareinventory.stocktti.service.HardwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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
    public MessageResponseDTO createHardware(@RequestBody @Valid HardwareDTO hardwareDTO) {
        return hardwareService.createHardware(hardwareDTO);
    }

    @GetMapping
    public List<HardwareDTO> listAll() {
        return hardwareService.listAll();
    }

    @GetMapping("/{id}")
    public HardwareDTO findById(@PathVariable Long id) throws HardwareNotFoundException {
        return hardwareService.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws HardwareNotFoundException {
        hardwareService.delete(id);
    }
}
