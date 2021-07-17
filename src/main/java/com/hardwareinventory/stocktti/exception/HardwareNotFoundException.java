package com.hardwareinventory.stocktti.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class HardwareNotFoundException extends Exception {
    public HardwareNotFoundException(Long id) {
        super("Hardware not found with ID " + id);
    }
}
