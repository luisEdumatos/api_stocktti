package com.hardwareinventory.stocktti.dto.mapper;

import com.hardwareinventory.stocktti.dto.request.HardwareDTO;
import com.hardwareinventory.stocktti.entity.Hardware;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HardwareMapper {

    HardwareMapper INSTANCE = Mappers.getMapper(HardwareMapper.class);

    Hardware toModel(HardwareDTO hardwareDTO);

    HardwareDTO toDTO(Hardware hardware);
}
