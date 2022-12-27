package com.bootcamp.sprint3.integration;

import com.bootcamp.sprint3.dto.request.InboundOrderReqDto;
import com.bootcamp.sprint3.dto.response.BatchStockResponseDto;
import com.bootcamp.sprint3.entity.InboundOrder;
import com.bootcamp.sprint3.entity.Product;
import com.bootcamp.sprint3.entity.Section;
import com.bootcamp.sprint3.entity.Warehouse;
import com.bootcamp.sprint3.repository.IInboundOrderRepository;
import com.bootcamp.sprint3.repository.IProductRepository;
import com.bootcamp.sprint3.repository.ISectionRepository;
import com.bootcamp.sprint3.repository.IWarehouseRepository;
import com.bootcamp.sprint3.service.imp.InboundOrderService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Optional;

import static com.bootcamp.sprint3.utils.Factory.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@ExtendWith(MockitoExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class InboundOrderControllerTest {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    private IProductRepository productRepository;
    @MockBean
    private IWarehouseRepository warehouseRepository;
    @MockBean
    private ISectionRepository sectionRepository;
    @MockBean
    private IInboundOrderRepository inboundOrderRepository;


    @Autowired
    private InboundOrderService service;


    @Nested
    class ml_insert_batch_in_fulfillment_warehouse_01{
        @Test
        void save_Ok_Test() throws Exception {

            Product product = getProduct(1000.);
            product.setProductId(1);


            InboundOrder inboundOrder=getInboundOrder(1000.,"Buyer","123",product);
            InboundOrderReqDto inboundOrderReqDto=getInboundOrderReqDto(15000.,"buyer","123",product);

            Warehouse warehouse=getWarehouse(1000.,"pepe","123");

            Section section=getSection();




           when(productRepository.findById(any())).thenReturn(Optional.of(product));
           when(sectionRepository.findById(any())).thenReturn(Optional.of(section));
           when(warehouseRepository.findById(any())).thenReturn(Optional.of(warehouse));
           when(inboundOrderRepository.save(any())).thenReturn(inboundOrder);


            String payload= new ObjectMapper().registerModule(new JavaTimeModule()).writeValueAsString(inboundOrderReqDto);

           mockMvc.perform(post("/api/v1/fresh-products/inboundorder")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(payload))
                    .andDo(print())
                    .andExpect(status().isCreated());

        }
    }

}
