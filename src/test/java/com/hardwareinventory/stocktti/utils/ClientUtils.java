package com.hardwareinventory.stocktti.utils;

import com.hardwareinventory.stocktti.dto.request.ClientDTO;
import com.hardwareinventory.stocktti.entity.Client;


public class ClientUtils {

    private static final long ID = 1L;
    private static final String NAME = "Cliente Corporation";
    private static final String CNPJ = "12345678910";
    private static final String ADDRESS = "Avenida Teste unitario, 123";

    public static ClientDTO createFakeDTO() {
        return ClientDTO.builder()
                .name(NAME)
                .cnpj(CNPJ)
                .address(ADDRESS)
                .build();
    }

    public static Client createFakeEntity() {
        return Client.builder()
                .id(ID)
                .name(NAME)
                .cnpj(CNPJ)
                .address(ADDRESS)
                .build();
    }
}
