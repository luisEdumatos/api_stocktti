package com.hardwareinventory.stocktti.service;

import com.hardwareinventory.stocktti.dto.mapper.HardwareMapper;
import com.hardwareinventory.stocktti.dto.request.HardwareDTO;
import com.hardwareinventory.stocktti.dto.response.MessageResponseDTO;
import com.hardwareinventory.stocktti.entity.Hardware;
import com.hardwareinventory.stocktti.exception.HardwareNotFoundException;
import com.hardwareinventory.stocktti.repository.HardwareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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

    public HardwareDTO findById(Long id) throws HardwareNotFoundException {
        Hardware hardware = verifyExists(id);
        return hardwareMapper.toDTO(hardware);
    }

    public void delete(Long id) throws HardwareNotFoundException {
        verifyExists(id);
        hardwareRepository.deleteById(id);
    }

    public Hardware verifyExists(Long id) throws HardwareNotFoundException {
        Optional<Hardware> optionalHardware = hardwareRepository.findById(id);
        if (optionalHardware.isEmpty()) {
            throw new HardwareNotFoundException(id);
        }
        return optionalHardware.get();
    }

}
