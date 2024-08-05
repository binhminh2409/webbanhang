package com.banhang.demo.mapper.impl;

import com.banhang.demo.Dto.ProductDto;
import com.banhang.demo.Entity.Product;
import com.banhang.demo.mapper.ProductMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ProductMapperImpl implements ProductMapper {
    public ProductDto entityToDto (Product entity) {
        ProductDto dto = new ProductDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    public Product dtoToEntity (ProductDto dto) {
        Product entity = new Product();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }
}
