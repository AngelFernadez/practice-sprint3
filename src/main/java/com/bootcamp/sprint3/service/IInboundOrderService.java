package com.bootcamp.sprint3.service;

import com.bootcamp.sprint3.dto.all.BatchDto;
import com.bootcamp.sprint3.dto.request.InboundOrderReqDto;
import com.bootcamp.sprint3.dto.request.PurchaseOrderDto;
import com.bootcamp.sprint3.dto.response.BatchStockResponseDto;
import com.bootcamp.sprint3.dto.response.CartViewDto;
import com.bootcamp.sprint3.dto.response.ProductResponseDto;

import java.util.List;

public interface IInboundOrderService {

   BatchStockResponseDto save(InboundOrderReqDto inboundOrderReqDto);
   BatchDto update(InboundOrderReqDto inboundOrderReqDto);
   List<ProductResponseDto> findAll();
   List<ProductResponseDto> findAllBySection(String category);
   CartViewDto createOrder(PurchaseOrderDto purchaseOrderDto);


}
