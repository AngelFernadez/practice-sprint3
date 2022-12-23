package com.bootcamp.sprint3.service;

import com.bootcamp.sprint3.dto.all.BatchStockDto;
import com.bootcamp.sprint3.dto.request.PurchaseOrderDto;
import com.bootcamp.sprint3.dto.response.CartViewDto;
import com.bootcamp.sprint3.dto.response.InboundOrderViewDto;
import com.bootcamp.sprint3.dto.response.ProductDto;

import java.util.List;

public interface IInboundOrderService {

   BatchStockDto save(InboundOrderViewDto orderViewDto);
   BatchStockDto update(InboundOrderViewDto orderViewDto);
   List<ProductDto> findAll();
   List<ProductDto> findAllBySection(String category);
   CartViewDto createOrder(PurchaseOrderDto purchaseOrderDto);


}
