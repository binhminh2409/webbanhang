package com.banhang.demo.Dto;

import com.banhang.demo.Entity.Manufacturer;
import com.banhang.demo.Entity.ProductType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private float price;

    @Column(nullable = false)
    private ProductTypeDto type;

    @Column
    private String image;

    @Column
    private int discount;

    @ManyToOne
    @JoinColumn(name = "manufacturer_id", nullable = false)
    private ManufacturerDto manufacturer;
}
