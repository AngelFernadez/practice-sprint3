package com.bootcamp.sprint3.dto.response;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class BatchStockExpirationDto {

    private Integer batchNumber;
    private Integer productId;
    private LocalDate dueDate;
    private Integer currentQuantity;
}
