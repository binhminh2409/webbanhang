package com.banhang.demo.mapper.impl;

import com.banhang.demo.Dto.ManufacturerDto;
import com.banhang.demo.Entity.Manufacturer;
import com.banhang.demo.mapper.ManufacturerMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ManufacturerMapperImpl implements ManufacturerMapper {
    public ManufacturerDto entityToDto (Manufacturer entity) {
        ManufacturerDto dto = new ManufacturerDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    public Manufacturer dtoToEntity (ManufacturerDto dto) {
        Manufacturer entity = new Manufacturer();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }
}
