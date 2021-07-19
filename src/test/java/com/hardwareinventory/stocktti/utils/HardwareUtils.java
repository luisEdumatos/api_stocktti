package com.hardwareinventory.stocktti.utils;

import com.hardwareinventory.stocktti.dto.request.HardwareDTO;
import com.hardwareinventory.stocktti.entity.Hardware;
import com.hardwareinventory.stocktti.enums.DeviceStatusCondition;
import com.hardwareinventory.stocktti.enums.DeviceType;

public class HardwareUtils {

    private static final long ID = 1L;
    private static final String DEVICELOCALIZATION = "Teste Localização";
    private static final String DEVICEOWNERUSERNAME = "Teste Nome Usuario";
    private static final String DEVICETAG = "DESKTOP-TESTE";
    private static final DeviceType DEVICE_TYPE = DeviceType.DESKTOP;
    private static final String DEVICEBRAND = "Marca";
    private static final String DEVICEMODEL = "Modelo Teste";
    private static final String DEVICESO = "SO Teste";
    private static final boolean DEVICESOLICENSED = true;
    private static final boolean DEVICEOFFICELICENSED = true;
    private static final boolean DEVICEANTIVIRUSLICENSED = true;
    private static final String DEVICEPROCESSOR = "PTeste";
    private static final String DEVICEPROCESSORGENERATION = "GTeste";
    private static final String DEVICEPROCESSORGHZ = "GHZ";
    private static final String DEVICERAM = "RAM";
    private static final String DEVICEHD = "DEVHD";
    private static final DeviceStatusCondition DEVICE_STATUS_CONDITION = DeviceStatusCondition.MODERNO;
    private static final String DEVICESWAPPREDICTION = "2025";

    public static HardwareDTO createFakeDTO() {
        return HardwareDTO.builder()
                .deviceLocalization(DEVICELOCALIZATION)
                .deviceOwnerUserName(DEVICEOWNERUSERNAME)
                .deviceTag(DEVICETAG)
                .deviceType(DEVICE_TYPE)
                .deviceBrand(DEVICEBRAND)
                .deviceModel(DEVICEMODEL)
                .deviceSO(DEVICESO)
                .deviceSOLicensed(DEVICESOLICENSED)
                .deviceOfficeLicensed(DEVICEOFFICELICENSED)
                .deviceAntivirusLicensed(DEVICEANTIVIRUSLICENSED)
                .deviceProcessor(DEVICEPROCESSOR)
                .deviceProcessorGeneration(DEVICEPROCESSORGENERATION)
                .deviceProcessorGHZ(DEVICEPROCESSORGHZ)
                .deviceRAM(DEVICERAM)
                .deviceHD(DEVICEHD)
                .deviceStatusCondition(DEVICE_STATUS_CONDITION)
                .deviceSwapPrediction(DEVICESWAPPREDICTION)
                .build();
    }

    public static Hardware createFakeEntity() {
        return Hardware.builder()
                .id(ID)
                .deviceLocalization(DEVICELOCALIZATION)
                .deviceOwnerUserName(DEVICEOWNERUSERNAME)
                .deviceTag(DEVICETAG)
                .deviceType(DEVICE_TYPE)
                .deviceBrand(DEVICEBRAND)
                .deviceModel(DEVICEMODEL)
                .deviceSO(DEVICESO)
                .deviceSOLicensed(DEVICESOLICENSED)
                .deviceOfficeLicensed(DEVICEOFFICELICENSED)
                .deviceAntivirusLicensed(DEVICEANTIVIRUSLICENSED)
                .deviceProcessor(DEVICEPROCESSOR)
                .deviceProcessorGeneration(DEVICEPROCESSORGENERATION)
                .deviceProcessorGHZ(DEVICEPROCESSORGHZ)
                .deviceRAM(DEVICERAM)
                .deviceHD(DEVICEHD)
                .deviceStatusCondition(DEVICE_STATUS_CONDITION)
                .deviceSwapPrediction(DEVICESWAPPREDICTION)
                .build();
    }

}
