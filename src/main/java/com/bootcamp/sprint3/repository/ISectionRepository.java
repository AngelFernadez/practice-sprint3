package com.bootcamp.sprint3.repository;

import com.bootcamp.sprint3.entity.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISectionRepository extends JpaRepository<Section,Integer> {
}
