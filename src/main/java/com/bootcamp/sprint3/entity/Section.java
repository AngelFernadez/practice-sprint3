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
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sectionCode;
   /* @ManyToMany
    @JoinTable(
            name = "warehouse_section",
            joinColumns = @JoinColumn(name = "section_code"),
            inverseJoinColumns = @JoinColumn(name = "warehouse_code")
    )
    private List<Warehouse> warehouses;*/
}
