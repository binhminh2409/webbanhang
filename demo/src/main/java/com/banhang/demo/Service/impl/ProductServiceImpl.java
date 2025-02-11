package com.banhang.demo.Service.impl;

import com.banhang.demo.Dto.ManufacturerDto;
import com.banhang.demo.Dto.ProductDto;
import com.banhang.demo.Entity.Manufacturer;
import com.banhang.demo.Entity.Product;
import com.banhang.demo.Repository.ManufacturerRepository;
import com.banhang.demo.Repository.ProductRepository;
import com.banhang.demo.Repository.ProductTypeRepository;
import com.banhang.demo.Service.ProductService;
import com.banhang.demo.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    ManufacturerRepository manufacturerRepository;

    @Autowired
    ProductTypeRepository productTypeRepository;

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<ProductDto> findAll() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map(productMapper::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductDto> findByManufacturer(long manufacturerId) {
        Manufacturer manufacturer = manufacturerRepository.findById(manufacturerId).orElse(null);
        if (manufacturer != null) {
            List<Product> products = productRepository.findByManufacturer(manufacturer);
            return products.stream()
                    .map(productMapper::entityToDto)
                    .collect(Collectors.toList());
        }
        return null;
    }

    @Override
    public ProductDto findById(long id) {
        Product Product = productRepository.findById(id).orElse(null);
        return productMapper.entityToDto(Product);
    }

    @Override
    public ProductDto create(ProductDto dto) {
        Product entity = productMapper.dtoToEntity(dto);

//      Check Product existence
        long productTypeId = entity.getType().getId();
        boolean productTypeExists = (productTypeRepository.findById(productTypeId).isPresent());

        if (!productTypeExists) {
            productTypeRepository.save(entity.getType());
        }

        Product savedEntity = productRepository.save(entity);
        return productMapper.entityToDto(savedEntity);
    }

    @Override
    public ProductDto update(ProductDto dto) {
//        Check existence
        if (productRepository.findById(dto.getId()).isEmpty()) {
            return null;
        }
        Product entity = productMapper.dtoToEntity(dto);
        Product savedEntity = productRepository.save(entity);
        return productMapper.entityToDto(savedEntity);
    }

    @Override
    public ProductDto delete(long id) {
        Product Product = productRepository.findById(id).orElse(null);
        if (Product == null) {
            return null;
        }
        ProductDto dto = productMapper.entityToDto(Product);
        productRepository.delete(Product);
        return dto;
    }
}
