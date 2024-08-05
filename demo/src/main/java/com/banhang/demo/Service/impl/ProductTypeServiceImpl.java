package com.banhang.demo.Service.impl;

import com.banhang.demo.Dto.ProductDto;
import com.banhang.demo.Dto.ProductTypeDto;
import com.banhang.demo.Entity.Product;
import com.banhang.demo.Entity.ProductType;
import com.banhang.demo.Repository.ProductTypeRepository;
import com.banhang.demo.Service.ProductTypeService;
import com.banhang.demo.mapper.ProductTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {
    @Autowired
    ProductTypeRepository productTypeRepository;

    @Autowired
    ProductTypeMapper productTypeMapper;

    @Override
    public List<ProductTypeDto> findAll() {
        List<ProductType> productTypes = productTypeRepository.findAll();
        return productTypes.stream()
                .map(productTypeMapper::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public ProductTypeDto findById(long id) {
        ProductType productType = productTypeRepository.findById(id).orElse(null);
        return productTypeMapper.entityToDto(productType);
    }

    @Override
    public ProductTypeDto create(ProductTypeDto dto) {
        ProductType entity = productTypeMapper.dtoToEntity(dto);
        ProductType savedEntity = productTypeRepository.save(entity);
        return productTypeMapper.entityToDto(savedEntity);
    }

    @Override
    public ProductTypeDto update(ProductTypeDto dto) {
//        Check existence
        if (productTypeRepository.findById(dto.getId()) == null) {
            return null;
        }
        ProductType entity = productTypeMapper.dtoToEntity(dto);
        ProductType savedEntity = productTypeRepository.save(entity);
        return productTypeMapper.entityToDto(savedEntity);
    }

    @Override
    public ProductTypeDto delete(long id) {
        ProductType ProductType = productTypeRepository.findById(id).orElse(null);
        if (ProductType == null) {
            return null;
        }
        ProductTypeDto dto = productTypeMapper.entityToDto(ProductType);
        productTypeRepository.delete(ProductType);
        return dto;
    }
}
