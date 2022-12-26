package com.bootcamp.sprint3.dto.request;

import com.bootcamp.sprint3.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
public class PurchaseOrderDto {
    private LocalDate date;
    private User buyer;
    private OrderStatusDto orderStatus;
}
