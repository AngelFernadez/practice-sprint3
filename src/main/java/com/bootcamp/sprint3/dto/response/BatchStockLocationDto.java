package com.bootcamp.sprint3.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class BatchStockLocationDto {
    private Integer batchNumber;
    private Integer currentQuantity;
    private LocalDate dueDate;
}
