package com.bootcamp.sprint3.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class BatchStockExpirationDto {

    private Integer batchNumber;
    private Integer productId;
    private Integer productTypeId;
    private LocalDate dueDate;
    private Integer currentQuantity;
}
