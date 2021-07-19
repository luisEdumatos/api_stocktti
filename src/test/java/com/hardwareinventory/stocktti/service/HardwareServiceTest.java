package com.hardwareinventory.stocktti.service;

import com.hardwareinventory.stocktti.dto.request.HardwareDTO;
import com.hardwareinventory.stocktti.dto.response.MessageResponseDTO;
import com.hardwareinventory.stocktti.entity.Hardware;
import com.hardwareinventory.stocktti.repository.HardwareRepository;
import com.hardwareinventory.stocktti.utils.HardwareUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class HardwareServiceTest {

    @Mock
    private HardwareRepository hardwareRepository;

    @InjectMocks
    private HardwareService hardwareService;

    @Test
    void testGivenHardwareDTOThenReturnSuccessSavedMessage() {
        HardwareDTO hardwareDTO = HardwareUtils.createFakeDTO();
        Hardware expectedSaveHardware = HardwareUtils.createFakeEntity();

        Mockito.when(hardwareRepository.save(Mockito.any(Hardware.class))).thenReturn(expectedSaveHardware);

        MessageResponseDTO expectedSuccessMessage = createExpectedSuccessMessage(expectedSaveHardware.getId());
        MessageResponseDTO successMessage = hardwareService.createHardware(hardwareDTO);

        Assertions.assertEquals(expectedSuccessMessage, successMessage);
    }

    private MessageResponseDTO createExpectedSuccessMessage(Long savedHardwareId) {
        return MessageResponseDTO.builder()
                .message("Created hardware with ID " + savedHardwareId)
                .build();
    }

}
