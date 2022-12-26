package com.bootcamp.sprint3.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ProductRequestDto {
    private Integer productId;
    private Integer quality;
}
