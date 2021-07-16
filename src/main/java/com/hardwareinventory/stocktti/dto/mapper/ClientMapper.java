package com.hardwareinventory.stocktti.dto.mapper;

import com.hardwareinventory.stocktti.dto.request.ClientDTO;
import com.hardwareinventory.stocktti.entity.Client;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClientMapper {

    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    Client toModel(ClientDTO clientDTO);

    ClientDTO toDTO(Client client);
}
