package com.bootcamp.sprint3.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class PurchaseOrderDto {
    private LocalDate date;
    private Integer buyerId; //buyerId: Buyer hace falta modelar?
    private OrderStatusDto orderStatus;
}
