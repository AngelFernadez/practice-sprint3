package com.bootcamp.sprint3.unit.service;

import com.bootcamp.sprint3.dto.request.InboundOrderReqDto;
import com.bootcamp.sprint3.dto.response.BatchStockResponseDto;
import com.bootcamp.sprint3.entity.InboundOrder;
import com.bootcamp.sprint3.entity.Product;
import com.bootcamp.sprint3.entity.Section;
import com.bootcamp.sprint3.entity.Warehouse;
import com.bootcamp.sprint3.exception.NotFoundException;
import com.bootcamp.sprint3.repository.IInboundOrderRepository;
import com.bootcamp.sprint3.repository.IProductRepository;
import com.bootcamp.sprint3.repository.ISectionRepository;
import com.bootcamp.sprint3.repository.IWarehouseRepository;
import com.bootcamp.sprint3.service.imp.InboundOrderService;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static com.bootcamp.sprint3.utils.Factory.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
class InboundOrderServiceTest {
    @Mock
    private IInboundOrderRepository inboundOrderRepository;
    @Mock
    private IProductRepository productRepository;
    @Mock
    private IWarehouseRepository warehouseRepository;
    @Mock
    private ISectionRepository sectionRepository;


    @InjectMocks
    private InboundOrderService service;


    //nomenclatura del nombre:
    // nombre del método + resultado esperado + test
    //ej: savePostOkTest()


    @Nested
    class ml_insert_batch_in_fulfillment_warehouse_01 {
        @Test
        void saveInboundOrder_Ok_Test() {
            Product product = getProduct(1000.);
            InboundOrder inboundOrder = getInboundOrder(15000., "buyer", "123", product);
            BatchStockResponseDto batchStockResponseDto = getBatchStockResponseDto(product.getProductId());
            InboundOrderReqDto inboundOrderReqDto=getInboundOrderReqDto(15000.,"buyer","123",product);

            Warehouse warehouse=getWarehouse(1000.,"pepe","123");
            Section section=getSection();


            when(productRepository.findById(any())).thenReturn(Optional.of(product));
            when(sectionRepository.findById(any())).thenReturn(Optional.of(section));
            when(warehouseRepository.findById(any())).thenReturn(Optional.of(warehouse));
            when(inboundOrderRepository.save(any())).thenReturn(inboundOrder);

            BatchStockResponseDto resp = service.save(inboundOrderReqDto);

            assertTrue(resp.getBatchStock().size() != 0);
        }
        @Test
        void saveInboundOrder_NotFoundProductId_Test() {
            Product product = getProduct(1000.);
            InboundOrder inboundOrder = getInboundOrder(15000., "buyer", "123", product);
            BatchStockResponseDto batchStockResponseDto = getBatchStockResponseDto(product.getProductId());
            InboundOrderReqDto inboundOrderReqDto=getInboundOrderReqDto(15000.,"buyer","123",product);

            Warehouse warehouse=getWarehouse(1000.,"pepe","123");
            Section section=getSection();


            when(productRepository.findById(any())).thenReturn(Optional.empty());
            when(sectionRepository.findById(any())).thenReturn(Optional.of(section));
            when(warehouseRepository.findById(any())).thenReturn(Optional.of(warehouse));
            when(inboundOrderRepository.save(any())).thenReturn(inboundOrder);

            assertThrows(NotFoundException.class,()->service.save(inboundOrderReqDto));
        }
        @Test
        void saveInboundOrder_NotFoundSectionId_Test() {
            Product product = getProduct(1000.);
            InboundOrder inboundOrder = getInboundOrder(15000., "buyer", "123", product);
            BatchStockResponseDto batchStockResponseDto = getBatchStockResponseDto(product.getProductId());
            InboundOrderReqDto inboundOrderReqDto=getInboundOrderReqDto(15000.,"buyer","123",product);

            Warehouse warehouse=getWarehouse(1000.,"pepe","123");
            Section section=getSection();


            when(productRepository.findById(any())).thenReturn(Optional.of(product));
            when(sectionRepository.findById(any())).thenReturn(Optional.empty());
            when(warehouseRepository.findById(any())).thenReturn(Optional.of(warehouse));
            when(inboundOrderRepository.save(any())).thenReturn(inboundOrder);

            assertThrows(NotFoundException.class,()->service.save(inboundOrderReqDto));
        }
        @Test
        void saveInboundOrder_NotFoundWarehouseId_Test() {
            Product product = getProduct(1000.);
            InboundOrder inboundOrder = getInboundOrder(15000., "buyer", "123", product);
            BatchStockResponseDto batchStockResponseDto = getBatchStockResponseDto(product.getProductId());
            InboundOrderReqDto inboundOrderReqDto=getInboundOrderReqDto(15000.,"buyer","123",product);

            Warehouse warehouse=getWarehouse(1000.,"pepe","123");
            Section section=getSection();


            when(productRepository.findById(any())).thenReturn(Optional.of(product));
            when(sectionRepository.findById(any())).thenReturn(Optional.of(section));
            when(warehouseRepository.findById(any())).thenReturn(Optional.empty());
            when(inboundOrderRepository.save(any())).thenReturn(inboundOrder);

            assertThrows(NotFoundException.class,()->service.save(inboundOrderReqDto));
        }
    }

}