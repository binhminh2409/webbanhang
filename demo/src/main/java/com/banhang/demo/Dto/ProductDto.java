package com.banhang.demo.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private long id;

    private String name;

    private float price;

    private ProductTypeDto type;

    private String image;

    private int discount;

    private ManufacturerDto manufacturer;
}
