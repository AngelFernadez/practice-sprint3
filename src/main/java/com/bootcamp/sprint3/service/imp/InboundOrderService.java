package com.bootcamp.sprint3.service.imp;

import com.bootcamp.sprint3.dto.all.BatchStockDto;
import com.bootcamp.sprint3.dto.request.PurchaseOrderDto;
import com.bootcamp.sprint3.dto.response.CartViewDto;
import com.bootcamp.sprint3.dto.response.InboundOrderViewDto;
import com.bootcamp.sprint3.dto.response.ProductResponseDto;
import com.bootcamp.sprint3.service.IInboundOrderService;

import java.util.List;

public class InboundOrderService implements IInboundOrderService {
    @Override
    public BatchStockDto save(InboundOrderViewDto orderViewDto) {
        return null;
    }

    @Override
    public BatchStockDto update(InboundOrderViewDto orderViewDto) {
        return null;
    }

    @Override
    public List<ProductResponseDto> findAll() {
        return null;
    }

    @Override
    public List<ProductResponseDto> findAllBySection(String category) {
        return null;
    }

    @Override
    public CartViewDto createOrder(PurchaseOrderDto purchaseOrderDto) {
        return null;
    }
}
