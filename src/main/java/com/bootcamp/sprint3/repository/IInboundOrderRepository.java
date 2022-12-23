package com.bootcamp.sprint3.repository;

import com.bootcamp.sprint3.entity.InboundOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInboundOrderRepository extends JpaRepository<InboundOrder,Integer> {
}
