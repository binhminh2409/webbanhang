package com.banhang.demo.mapper;

import com.banhang.demo.Dto.ProductTypeDto;
import com.banhang.demo.Entity.ProductType;
import org.springframework.beans.BeanUtils;

public interface ProductTypeMapper {
    ProductTypeDto entityToDto (ProductType entity);

    ProductType dtoToEntity (ProductTypeDto dto);
}
