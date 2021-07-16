package com.hardwareinventory.stocktti.dto.request;

import com.hardwareinventory.stocktti.entity.Hardware;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO {

    private Long id;

    @NotEmpty
    @Size(min = 5, max = 50)
    private String name;

    @NotEmpty
    @Size(min = 10, max = 14)
    private String cnpj;

    @NotEmpty
    @Size(min = 10, max = 100)
    private String address;

    private final List<Hardware> equipment = new ArrayList<>();
}
