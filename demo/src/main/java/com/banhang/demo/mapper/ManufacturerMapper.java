package com.banhang.demo.mapper;

import com.banhang.demo.Dto.ManufacturerDto;
import com.banhang.demo.Entity.Manufacturer;

public interface ManufacturerMapper {
    ManufacturerDto entityToDto (Manufacturer entity);

    Manufacturer dtoToEntity (ManufacturerDto dto);
}
