package com.bootcamp.sprint3.dto.request;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class CartReqDto {
    private PurchaseOrderDto purchaseOrder;
    private List<ProductRequestDto> products;
}
