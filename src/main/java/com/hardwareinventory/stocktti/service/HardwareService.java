package com.hardwareinventory.stocktti.service;

import com.hardwareinventory.stocktti.dto.MessageResponseDTO;
import com.hardwareinventory.stocktti.entity.Hardware;
import com.hardwareinventory.stocktti.repository.HardwareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HardwareService {

    private HardwareRepository hardwareRepository;

    @Autowired
    public HardwareService(HardwareRepository hardwareRepository) {
        this.hardwareRepository = hardwareRepository;
    }

    public MessageResponseDTO createHardware(Hardware hardware) {
        Hardware savedHardware = hardwareRepository.save(hardware);
        return MessageResponseDTO
                .builder()
                .message("Created hardware with ID " + savedHardware.getId())
                .build();
    }
}
