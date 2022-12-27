package com.bootcamp.sprint3.dto.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class ProductRequestDto {
    private Integer productId;
    private Integer quality;
}
