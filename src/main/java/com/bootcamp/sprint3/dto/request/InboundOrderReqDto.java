package com.bootcamp.sprint3.dto.request;

import com.bootcamp.sprint3.dto.all.InboundOrderDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InboundOrderReqDto {

    @Valid
    private InboundOrderDto inboundOrder;

}
