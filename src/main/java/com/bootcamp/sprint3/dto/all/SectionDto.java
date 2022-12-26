package com.bootcamp.sprint3.dto.all;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Getter
public class SectionDto {
    @NotNull
    private Integer sectionCode;
    @NotNull
    private Integer warehouseCode;
}
