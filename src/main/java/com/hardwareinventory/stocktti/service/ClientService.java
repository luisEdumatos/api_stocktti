package com.hardwareinventory.stocktti.service;

import com.hardwareinventory.stocktti.dto.mapper.ClientMapper;
import com.hardwareinventory.stocktti.dto.request.ClientDTO;
import com.hardwareinventory.stocktti.dto.response.MessageResponseDTO;
import com.hardwareinventory.stocktti.entity.Client;
import com.hardwareinventory.stocktti.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private ClientRepository clientRepository;

    private final ClientMapper clientMapper = ClientMapper.INSTANCE;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public MessageResponseDTO createClient(ClientDTO clientDTO) {
        Client client = clientMapper.toModel(clientDTO);
        Client savedClient = clientRepository.save(client);
        return MessageResponseDTO
                .builder()
                .message("Created client with ID " + savedClient.getId())
                .build();
    }
}
