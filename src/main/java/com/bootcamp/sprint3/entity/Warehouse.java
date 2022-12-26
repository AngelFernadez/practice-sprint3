package com.bootcamp.sprint3.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer warehouseCode;

    @OneToMany //puede fallar. Si falla, agregar cascade
    @JoinColumn(name = "warehouse_code")
    private List<Batch> batchStock;


    //falta la relacion con User.
    //Cada Warehouse tiene solo un User con rol representante
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "agent_id")
    private User agent;

}
