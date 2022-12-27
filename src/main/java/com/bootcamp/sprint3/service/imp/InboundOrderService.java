package com.bootcamp.sprint3.service.imp;

import com.bootcamp.sprint3.dto.all.BatchDto;
import com.bootcamp.sprint3.dto.request.InboundOrderReqDto;
import com.bootcamp.sprint3.dto.request.PurchaseOrderDto;
import com.bootcamp.sprint3.dto.response.BatchStockResponseDto;
import com.bootcamp.sprint3.dto.response.CartViewDto;
import com.bootcamp.sprint3.dto.response.ProductResponseDto;
import com.bootcamp.sprint3.entity.InboundOrder;
import com.bootcamp.sprint3.exception.BadRequestException;
import com.bootcamp.sprint3.exception.NotFoundException;
import com.bootcamp.sprint3.repository.IInboundOrderRepository;
import com.bootcamp.sprint3.repository.IProductRepository;
import com.bootcamp.sprint3.repository.ISectionRepository;
import com.bootcamp.sprint3.repository.IWarehouseRepository;
import com.bootcamp.sprint3.service.IInboundOrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InboundOrderService implements IInboundOrderService {

    private IInboundOrderRepository inboundOrderRepository;
    private ISectionRepository sectionRepository;
    private IWarehouseRepository warehouseRepository;
    @Autowired
    private IProductRepository productRepository;



    private ModelMapper mapper=new ModelMapper();


    public InboundOrderService(IInboundOrderRepository inboundOrderRepository, ISectionRepository sectionRepository, IWarehouseRepository warehouseRepository, IProductRepository productRepository) {
        this.inboundOrderRepository = inboundOrderRepository;
        this.sectionRepository = sectionRepository;
        this.warehouseRepository = warehouseRepository;
        this.productRepository = productRepository;

    }

    /**
     * US: ml-insert-batch-in-fulfillment-warehouse-01
     * method to save the inboundorder
     *
     * @param inboundOrderReqDto
     * @return batchStockDto
     * @throws NotFoundException if IDs don´t exist
     */

    @Override
    public BatchStockResponseDto save(InboundOrderReqDto inboundOrderReqDto) {

        validateAll(inboundOrderReqDto);
        InboundOrder inboundOrder=mapper
                .map(inboundOrderReqDto, InboundOrder.class);
        inboundOrder.setWarehouse(warehouseRepository.findById(inboundOrderReqDto.getInboundOrder().getSection().getWarehouseCode()).get());
        inboundOrder.setSection(sectionRepository.findById(inboundOrderReqDto.getInboundOrder().getSection().getSectionCode()).get());

        inboundOrderRepository
                .save(inboundOrder);
        return new BatchStockResponseDto(inboundOrderReqDto.getInboundOrder().getBatchStock());
    }

    @Override
    public BatchDto update(InboundOrderReqDto orderReqDto) {
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

    //-------------------------------private----------------------------
    private void validProduct(Integer productId) {
        productRepository.findById(productId)
                .orElseThrow(() -> new NotFoundException("product does not exist"));
    }

    private void validWarehouse(Integer warehouseId) {
        warehouseRepository.findById(warehouseId)
                .orElseThrow(() -> new NotFoundException("Warehouse does not exist"));
    }

    private void validSection(Integer sectionId) {
        sectionRepository.findById(sectionId)
                .orElseThrow(() -> new NotFoundException("Section does not exist"));
    }

    /**
     * validates product, warehouse and section
     *
     * @param inboundOrderReqDto
     */
    private void validateAll(InboundOrderReqDto inboundOrderReqDto) {
        inboundOrderReqDto.getInboundOrder().getBatchStock()
                .forEach(batchStockDto -> validProduct(batchStockDto.getProductId()));

        validSection(inboundOrderReqDto.getInboundOrder().getSection().getSectionCode());
        validWarehouse(inboundOrderReqDto.getInboundOrder().getSection().getWarehouseCode());
    }
}
