package com.banhang.demo.Service;

import com.banhang.demo.Dto.ManufacturerDto;

import java.util.List;

public interface ManufacturerService {
    List<ManufacturerDto> findAll();
    ManufacturerDto findById(long id);
    ManufacturerDto create(ManufacturerDto dto);
    ManufacturerDto update(ManufacturerDto dto);
    ManufacturerDto delete(long id);
}
