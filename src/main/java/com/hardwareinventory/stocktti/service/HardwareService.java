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
        Hardware hardwareToSave = hardwareMapper.toModel(hardwareDTO);
        Hardware savedHardware = hardwareRepository.save(hardwareToSave);
        return createMessageResponse(savedHardware.getId(), "Created hardware with ID ");
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

    public MessageResponseDTO updateById(Long id, HardwareDTO hardwareDTO) throws HardwareNotFoundException {
        verifyExists(id);
        Hardware hardwareToUpdate = hardwareMapper.toModel(hardwareDTO);
        Hardware updatedHardware = hardwareRepository.save(hardwareToUpdate);
        return createMessageResponse(updatedHardware.getId(), "Updated hardware with ID ");
    }

    private Hardware verifyExists(Long id) throws HardwareNotFoundException {
        Optional<Hardware> optionalHardware = hardwareRepository.findById(id);
        if (optionalHardware.isEmpty()) {
            throw new HardwareNotFoundException(id);
        }
        return optionalHardware.get();
    }

    private MessageResponseDTO createMessageResponse(long id, String msg) {
        return MessageResponseDTO
                .builder()
                .message(msg + id)
                .build();
    }
}
