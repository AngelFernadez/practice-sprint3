package com.bootcamp.sprint3.dto.response;

import com.bootcamp.sprint3.dto.all.BatchDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BatchStockResponseDto {
    List<BatchDto> batchStock;
}
