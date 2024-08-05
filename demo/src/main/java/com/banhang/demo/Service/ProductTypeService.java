package com.banhang.demo.Service;

import com.banhang.demo.Dto.ProductTypeDto;

import java.util.List;

public interface ProductTypeService {
    List<ProductTypeDto> findAll();
    ProductTypeDto findById(long id);
    ProductTypeDto create(ProductTypeDto dto);
    ProductTypeDto update(ProductTypeDto dto);
    ProductTypeDto delete(long id);
}
