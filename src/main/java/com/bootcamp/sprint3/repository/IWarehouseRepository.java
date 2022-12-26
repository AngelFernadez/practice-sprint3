package com.bootcamp.sprint3.repository;

import com.bootcamp.sprint3.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWarehouseRepository extends JpaRepository<Warehouse,Integer> {
}
