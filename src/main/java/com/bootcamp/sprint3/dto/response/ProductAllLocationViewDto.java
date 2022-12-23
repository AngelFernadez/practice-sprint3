package com.bootcamp.sprint3.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class ProductAllLocationViewDto {
    private int productId;
    private List<WarehousesDto> warehouses;
}
