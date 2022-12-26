package com.bootcamp.sprint3.dto.request;

import com.bootcamp.sprint3.dto.all.BatchStockDto;
import com.bootcamp.sprint3.dto.all.InboundOrderDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@Getter
public class InboundOrderReqDto {

    @Valid
    private InboundOrderDto inboundOrder;
    @Valid
    private List<BatchStockDto> batchStock;
}
