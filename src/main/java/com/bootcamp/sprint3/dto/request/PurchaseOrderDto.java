package com.bootcamp.sprint3.dto.request;

import com.bootcamp.sprint3.entity.User;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class PurchaseOrderDto {
    private LocalDate date;
    private User buyer;
    private OrderStatusDto orderStatus;
}
