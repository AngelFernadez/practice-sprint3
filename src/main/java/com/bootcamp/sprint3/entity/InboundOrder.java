package com.bootcamp.sprint3.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class InboundOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderNumber;
    private LocalDate orderDate;


    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "section_code")
    private Section section;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "warehouse_code")
    private Warehouse warehouse;


    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "order_number_id")
    private List<Batch> batchStock;


}
