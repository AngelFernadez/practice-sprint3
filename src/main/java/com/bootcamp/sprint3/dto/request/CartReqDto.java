package com.bootcamp.sprint3.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class CartReqDto {
    private PurchaseOrderDto purchaseOrder;
    private List<ProductRequestDto> products;
}
