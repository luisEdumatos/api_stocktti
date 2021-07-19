package com.hardwareinventory.stocktti.service;

import com.hardwareinventory.stocktti.dto.request.ClientDTO;
import com.hardwareinventory.stocktti.dto.response.MessageResponseDTO;
import com.hardwareinventory.stocktti.entity.Client;
import com.hardwareinventory.stocktti.repository.ClientRepository;
import com.hardwareinventory.stocktti.utils.ClientUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ClientServiceTest {

    @Mock
    private ClientRepository clientRepository;

    @InjectMocks
    private ClientService clientService;

    @Test
    void testGivenClientDTOThenReturnSuccessSavedMessage() {
        ClientDTO clientDTO = ClientUtils.createFakeDTO();
        Client expectedSaveClient = ClientUtils.createFakeEntity();

        Mockito.when(clientRepository.save(Mockito.any(Client.class))).thenReturn(expectedSaveClient);

        MessageResponseDTO expectedSuccessMessage = createExpectedSuccessMessage(expectedSaveClient.getId());
        MessageResponseDTO successMessage = clientService.createClient(clientDTO);

        Assertions.assertEquals(expectedSuccessMessage, successMessage);
    }

    private MessageResponseDTO createExpectedSuccessMessage(Long savedClientId) {
        return MessageResponseDTO.builder()
                .message("Created client with ID " + savedClientId)
                .build();
    }
}
