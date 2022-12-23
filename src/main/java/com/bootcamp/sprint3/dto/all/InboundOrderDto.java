package com.bootcamp.sprint3.dto.all;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class InboundOrderDto {
    private Integer orderNumber;
    private LocalDate orderDate;
    private SectionDto section;
}
