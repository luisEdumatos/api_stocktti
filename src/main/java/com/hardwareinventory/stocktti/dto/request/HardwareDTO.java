package com.hardwareinventory.stocktti.dto.request;

import com.hardwareinventory.stocktti.entity.Client;
import com.hardwareinventory.stocktti.enums.DeviceStatusCondition;
import com.hardwareinventory.stocktti.enums.DeviceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HardwareDTO {

    private Long id;

    @NotNull
    private Client client;

    private String deviceLocalization;

    private String deviceOwnerUserName;

    @NotEmpty
    @Size(min = 5, max = 15)
    private String deviceTag;

    @NotNull
    @Enumerated(EnumType.STRING)
    private DeviceType deviceType;

    @NotEmpty
    @Size(min = 2, max = 10)
    private String deviceBrand;

    @NotEmpty
    @Size(max = 50)
    private String deviceModel;

    @NotEmpty
    @Size(min = 5, max = 40)
    private String deviceSO;

    @NotNull
    private boolean deviceSOLicensed;

    @NotNull
    private boolean deviceOfficeLicensed;

    @NotNull
    private boolean deviceAntivirusLicensed;

    @NotEmpty
    @Size(min = 2, max = 15)
    private String deviceProcessor;

    @NotEmpty
    @Size(min = 2, max = 10)
    private String deviceProcessorGeneration;

    @NotEmpty
    @Size(min = 4, max = 10)
    private String deviceProcessorGHZ;

    @NotEmpty
    @Size(min = 3, max = 5)
    private String deviceRAM;

    @NotEmpty
    @Size(min = 4, max = 10)
    private String deviceHD;

    @NotNull
    @Enumerated(EnumType.STRING)
    private DeviceStatusCondition deviceStatusCondition;

    @NotEmpty
    @Size(min = 4, max = 10)
    private String deviceSwapPrediction;

}
