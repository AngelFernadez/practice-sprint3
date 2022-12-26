package com.bootcamp.sprint3.service;

import com.bootcamp.sprint3.dto.all.BatchStockDto;
import com.bootcamp.sprint3.dto.request.PurchaseOrderDto;
import com.bootcamp.sprint3.dto.response.CartViewDto;
import com.bootcamp.sprint3.dto.response.InboundOrderViewDto;
import com.bootcamp.sprint3.dto.response.ProductResponseDto;

import java.util.List;

public interface IInboundOrderService {

   BatchStockDto save(InboundOrderViewDto orderViewDto);
   BatchStockDto update(InboundOrderViewDto orderViewDto);
   List<ProductResponseDto> findAll();
   List<ProductResponseDto> findAllBySection(String category);
   CartViewDto createOrder(PurchaseOrderDto purchaseOrderDto);


}
