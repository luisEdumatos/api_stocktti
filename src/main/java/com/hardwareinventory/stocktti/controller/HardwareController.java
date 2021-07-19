package com.hardwareinventory.stocktti.controller;

import com.hardwareinventory.stocktti.dto.request.HardwareDTO;
import com.hardwareinventory.stocktti.dto.response.MessageResponseDTO;
import com.hardwareinventory.stocktti.exception.HardwareNotFoundException;
import com.hardwareinventory.stocktti.service.HardwareService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/hardware")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class HardwareController {

    private HardwareService hardwareService;

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

    @PutMapping("/{id}")
    public MessageResponseDTO updateById(@PathVariable Long id, @RequestBody @Valid HardwareDTO hardwareDTO) throws HardwareNotFoundException {
        return hardwareService.updateById(id, hardwareDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws HardwareNotFoundException {
        hardwareService.delete(id);
    }
}
