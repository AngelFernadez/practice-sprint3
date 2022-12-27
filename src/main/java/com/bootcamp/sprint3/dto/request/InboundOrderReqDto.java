package com.bootcamp.sprint3.dto.request;

import com.bootcamp.sprint3.dto.all.InboundOrderDto;
import lombok.*;

import javax.validation.Valid;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class InboundOrderReqDto {

    @Valid
    private InboundOrderDto inboundOrder;

}
