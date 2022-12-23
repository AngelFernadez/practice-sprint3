package com.bootcamp.sprint3.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ProductDto {
    private Long productId;
    private Double unitPrice;
}
