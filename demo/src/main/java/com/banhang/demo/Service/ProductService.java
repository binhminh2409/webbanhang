package com.banhang.demo.Service;

import com.banhang.demo.Dto.ProductDto;
import com.banhang.demo.Dto.ProductDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    List<ProductDto> findAll();
    ProductDto findById(long id);
    ProductDto create(ProductDto dto);
    ProductDto update(ProductDto dto);
    ProductDto delete(long id);
}
