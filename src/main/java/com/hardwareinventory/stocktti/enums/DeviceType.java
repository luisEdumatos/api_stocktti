package com.hardwareinventory.stocktti.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DeviceType {
    NOTEBOOK("Notebook"),
    DESKTOP("Desktop");

    private final String description;
}
