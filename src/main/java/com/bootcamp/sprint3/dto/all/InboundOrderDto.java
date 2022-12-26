package com.bootcamp.sprint3.dto.all;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class InboundOrderDto {
    @NotNull
    private Integer orderNumber;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate orderDate;
    @Valid
    private SectionDto section;
}
