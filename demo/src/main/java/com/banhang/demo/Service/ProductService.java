package com.banhang.demo.Service;

import com.banhang.demo.Dto.ManufacturerDto;
import com.banhang.demo.Dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> findAll();
    List<ProductDto> findByManufacturer(long manufacturerId);
    ProductDto findById(long id);
    ProductDto create(ProductDto dto);
    ProductDto update(ProductDto dto);
    ProductDto delete(long id);
}
