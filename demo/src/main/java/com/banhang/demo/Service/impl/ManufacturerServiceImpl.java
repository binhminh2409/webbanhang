package com.banhang.demo.Service.impl;

import com.banhang.demo.Dto.ManufacturerDto;
import com.banhang.demo.Entity.Manufacturer;
import com.banhang.demo.Repository.ManufacturerRepository;
import com.banhang.demo.Service.ManufacturerService;
import com.banhang.demo.mapper.ManufacturerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {

    @Autowired
    ManufacturerRepository manufacturerRepository;

    @Autowired
    ManufacturerMapper manufacturerMapper;

    @Override
    public List<ManufacturerDto> findAll() {
        List<Manufacturer> manufacturers = manufacturerRepository.findAll();
        return manufacturers.stream()
                .map(manufacturerMapper::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public ManufacturerDto findById(long id) {
        Manufacturer manufacturer = manufacturerRepository.findById(id).orElse(null);
        return manufacturerMapper.entityToDto(manufacturer);
    }

    @Override
    public ManufacturerDto create(ManufacturerDto dto) {
        Manufacturer entity = manufacturerMapper.dtoToEntity(dto);
        Manufacturer savedEntity = manufacturerRepository.save(entity);
        return manufacturerMapper.entityToDto(savedEntity);
    }

    @Override
    public ManufacturerDto update(ManufacturerDto dto) {
//        Check existence
        if (manufacturerRepository.findById(dto.getId()) == null){
            return null;
        }
        Manufacturer entity = manufacturerMapper.dtoToEntity(dto);
        Manufacturer savedEntity = manufacturerRepository.save(entity);
        return manufacturerMapper.entityToDto(savedEntity);
    }

    @Override
    public ManufacturerDto delete(long id) {
        Manufacturer manufacturer = manufacturerRepository.findById(id).orElse(null);
        if (manufacturer == null){
            return null;
        }
        ManufacturerDto dto = manufacturerMapper.entityToDto(manufacturer);
        manufacturerRepository.delete(manufacturer);
        return dto;
    }
}
