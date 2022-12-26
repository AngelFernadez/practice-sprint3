package com.bootcamp.sprint3.unit.service;

import com.bootcamp.sprint3.repository.IInboundOrderRepository;
import com.bootcamp.sprint3.service.imp.InboundOrderService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class InboundOrderServiceTest {
    @Mock
    private IInboundOrderRepository Repository;

    @InjectMocks
    private InboundOrderService Service;

    //nomenclatura del nombre:
    // nombre del método + resultado esperado + test
    //ej: savePostOkTest()


    @Test
    void save() {
    }

    @Test
    void update() {
    }

    @Test
    void findAll() {
    }

    @Test
    void findAllBySection() {
    }

    @Test
    void createOrder() {
    }
}