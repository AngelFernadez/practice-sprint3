package com.bootcamp.sprint3.dto.all;

import lombok.*;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class SectionDto {
    @NotNull
    private Integer sectionCode;
    @NotNull
    private Integer warehouseCode;
}
