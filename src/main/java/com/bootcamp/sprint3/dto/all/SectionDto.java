package com.bootcamp.sprint3.dto.all;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Getter
@Setter
public class SectionDto {
    @NotNull
    private Integer sectionCode;
    @NotNull
    private Integer warehouseCode;
}
