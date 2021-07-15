package com.hardwareinventory.stocktti.service;

import com.hardwareinventory.stocktti.dto.MessageResponseDTO;
import com.hardwareinventory.stocktti.entity.Client;
import com.hardwareinventory.stocktti.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public MessageResponseDTO createClient(Client client) {
        Client savedClient = clientRepository.save(client);
        return MessageResponseDTO
                .builder()
                .message("Created client with ID " + savedClient.getId())
                .build();
    }
}
