package com.hardwareinventory.stocktti.controller;

import com.hardwareinventory.stocktti.dto.request.ClientDTO;
import com.hardwareinventory.stocktti.dto.response.MessageResponseDTO;
import com.hardwareinventory.stocktti.exception.ClientNotFoundException;
import com.hardwareinventory.stocktti.exception.HardwareNotFoundException;
import com.hardwareinventory.stocktti.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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
    public MessageResponseDTO createClient(@RequestBody @Valid ClientDTO clientDTO) {
        return clientService.createClient(clientDTO);
    }

    @GetMapping
    public List<ClientDTO> listAll() {
        return clientService.listAll();
    }

    @GetMapping("/{id}")
    public ClientDTO findById(@PathVariable Long id) throws ClientNotFoundException {
        return clientService.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws ClientNotFoundException, HardwareNotFoundException {
        clientService.delete(id);
    }
}
