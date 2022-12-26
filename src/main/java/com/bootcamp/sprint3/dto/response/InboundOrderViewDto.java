package com.bootcamp.sprint3.dto.response;

import com.bootcamp.sprint3.dto.all.BatchDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class InboundOrderViewDto {
    private List<BatchDto> batchStock;
}
