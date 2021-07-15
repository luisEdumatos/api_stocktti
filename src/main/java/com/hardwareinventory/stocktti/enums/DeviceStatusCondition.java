package com.hardwareinventory.stocktti.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DeviceStatusCondition {

    MEIO_TERMO("Meio-Termo"),
    OBSOLETO("Obsoleto"),
    MODERNO("Moderno");

    private final String description;
}
