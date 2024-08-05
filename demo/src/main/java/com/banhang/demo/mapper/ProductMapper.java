package com.banhang.demo.mapper;

import com.banhang.demo.Dto.ProductDto;
import com.banhang.demo.Entity.Product;
import org.springframework.beans.BeanUtils;

public interface ProductMapper {
    ProductDto entityToDto (Product entity);

    Product dtoToEntity (ProductDto dto);
}
