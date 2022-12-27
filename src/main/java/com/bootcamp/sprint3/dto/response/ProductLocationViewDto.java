package com.bootcamp.sprint3.dto.response;

import com.bootcamp.sprint3.dto.all.SectionDto;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class ProductLocationViewDto {
    private SectionDto section;
    private int productId;
    private List<BatchStockLocationDto> batchStock;

}
