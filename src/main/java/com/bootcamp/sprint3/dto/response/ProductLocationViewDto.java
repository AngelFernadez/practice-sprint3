package com.bootcamp.sprint3.dto.response;

import com.bootcamp.sprint3.dto.all.SectionDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class ProductLocationViewDto {
    private SectionDto section;
    private int productId;
    private List<BatchStockLocationDto> batchStock;

}
