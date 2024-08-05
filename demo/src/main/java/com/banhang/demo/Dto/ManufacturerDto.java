package com.banhang.demo.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ManufacturerDto {
    private long id;

    private String name;

    private String country;

    private String description;

    private boolean active;

}

