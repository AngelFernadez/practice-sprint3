package com.bootcamp.sprint3.entity;

import com.bootcamp.sprint3.enums.StatusCode;
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
public class PurchaseOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer purchase_id;
    private LocalDate date;
    //que hacemos con este buyer
    private Integer buyer_id;
    @Enumerated(EnumType.STRING)
    private StatusCode statusCode;
    //hace falta esta relacion
    @ManyToMany
    @JoinTable(
            name = "purchase_product",
            joinColumns = @JoinColumn(name = "purchase_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product>products;

}
