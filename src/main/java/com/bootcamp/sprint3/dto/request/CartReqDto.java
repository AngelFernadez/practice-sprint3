package com.bootcamp.sprint3.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class CartReqDto {
    private PurchaseOrderDto purchaseOrder;
    private List<ProductDto> products;
}
