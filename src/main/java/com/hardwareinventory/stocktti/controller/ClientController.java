package com.hardwareinventory.stocktti.controller;

import com.hardwareinventory.stocktti.dto.MessageResponseDTO;
import com.hardwareinventory.stocktti.entity.Client;
import com.hardwareinventory.stocktti.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/client")
public class ClientController {

    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createClient(@RequestBody Client client) {
        return clientService.createClient(client);
    }
}
