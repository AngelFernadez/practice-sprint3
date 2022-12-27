package com.bootcamp.sprint3.dto.response;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class BatchStockLocationDto {
    private Integer batchNumber;
    private Integer currentQuantity;
    private LocalDate dueDate;
}
