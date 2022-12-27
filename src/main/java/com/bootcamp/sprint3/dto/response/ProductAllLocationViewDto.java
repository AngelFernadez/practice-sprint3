package com.bootcamp.sprint3.dto.response;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class ProductAllLocationViewDto {
    private int productId;
    private List<WarehousesDto> warehouses;
}
