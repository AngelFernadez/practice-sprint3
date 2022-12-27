package com.bootcamp.sprint3.dto.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class WarehousesDto {
    private int warehouseCode;
    private int totalQuantity;
}
