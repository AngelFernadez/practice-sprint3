package com.bootcamp.sprint3.dto.all;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InboundOrderDto {
    @NotNull
    private Integer orderNumber;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate orderDate;
    @Valid
    private SectionDto section;
    @Valid
    private List<BatchDto> batchStock;
}
