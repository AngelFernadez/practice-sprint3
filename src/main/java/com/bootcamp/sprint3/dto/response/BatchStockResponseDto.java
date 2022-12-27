package com.bootcamp.sprint3.dto.response;

import com.bootcamp.sprint3.dto.all.BatchDto;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class BatchStockResponseDto {
    List<BatchDto> batchStock;
}
