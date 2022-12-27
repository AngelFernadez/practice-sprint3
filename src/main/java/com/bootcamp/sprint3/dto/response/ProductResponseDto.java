package com.bootcamp.sprint3.dto.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class ProductResponseDto {
    private Long productId;
    private Double unitPrice;
}
