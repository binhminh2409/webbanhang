package com.banhang.demo.mapper;

import com.banhang.demo.Dto.ManufacturerDto;
import com.banhang.demo.Entity.Manufacturer;
import org.springframework.beans.BeanUtils;

public interface ManufacturerMapper {
    ManufacturerDto entityToDto (Manufacturer entity);

    Manufacturer dtoToEntity (ManufacturerDto dto);
}
