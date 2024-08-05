package com.banhang.demo.mapper.impl;

import com.banhang.demo.Dto.ProductTypeDto;
import com.banhang.demo.Entity.ProductType;
import com.banhang.demo.mapper.ProductTypeMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeMapperImpl implements ProductTypeMapper {
    public ProductTypeDto entityToDto (ProductType entity) {
        ProductTypeDto dto = new ProductTypeDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    public ProductType dtoToEntity (ProductTypeDto dto) {
        ProductType entity = new ProductType();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }
}
