package com.banhang.demo.Service;

import com.banhang.demo.Dto.ManufacturerDto;
import com.banhang.demo.Entity.Manufacturer;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ManufacturerService {
    List<ManufacturerDto> findAll();
    ManufacturerDto findById(long id);
    ManufacturerDto create(ManufacturerDto dto);
    ManufacturerDto update(ManufacturerDto dto);
    ManufacturerDto delete(long id);
}
