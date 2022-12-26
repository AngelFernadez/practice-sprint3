package com.bootcamp.sprint3.controller;

import com.bootcamp.sprint3.dto.all.BatchDto;
import com.bootcamp.sprint3.dto.request.InboundOrderReqDto;
import com.bootcamp.sprint3.dto.response.BatchStockResponseDto;
import com.bootcamp.sprint3.service.IInboundOrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/fresh-products")
public class InboundOrderController {

    private IInboundOrderService service;

    public InboundOrderController(IInboundOrderService service) {
        this.service = service;
    }


    @PostMapping("/inboundorder")
    public ResponseEntity<BatchStockResponseDto> save(@Valid @RequestBody InboundOrderReqDto inboundOrderReqDto){
        return new ResponseEntity<>(service.save(inboundOrderReqDto), HttpStatus.CREATED);
    }
}
