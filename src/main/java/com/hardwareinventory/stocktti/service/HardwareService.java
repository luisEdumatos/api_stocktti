package com.hardwareinventory.stocktti.service;

import com.hardwareinventory.stocktti.dto.mapper.HardwareMapper;
import com.hardwareinventory.stocktti.dto.request.HardwareDTO;
import com.hardwareinventory.stocktti.dto.response.MessageResponseDTO;
import com.hardwareinventory.stocktti.entity.Hardware;
import com.hardwareinventory.stocktti.repository.HardwareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HardwareService {

    private HardwareRepository hardwareRepository;

    private final HardwareMapper hardwareMapper = HardwareMapper.INSTANCE;

    @Autowired
    public HardwareService(HardwareRepository hardwareRepository) {
        this.hardwareRepository = hardwareRepository;
    }

    public MessageResponseDTO createHardware(HardwareDTO hardwareDTO) {
        Hardware hardware = hardwareMapper.toModel(hardwareDTO);
        Hardware savedHardware = hardwareRepository.save(hardware);
        return MessageResponseDTO
                .builder()
                .message("Created hardware with ID " + savedHardware.getId())
                .build();
    }

    public List<HardwareDTO> listAll() {
        List<Hardware> allHardwars = hardwareRepository.findAll();
        return allHardwars.stream()
                .map(hardwareMapper::toDTO)
                .collect(Collectors.toList());
    }
}
