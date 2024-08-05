package com.banhang.demo.Controller;

import com.banhang.demo.Dto.ManufacturerDto;
import com.banhang.demo.Service.ManufacturerService;
import com.banhang.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/manufacturer/")
public class ManufacturerController {

    @Autowired
    ManufacturerService manufacturerService;

    @Autowired
    ProductService productService;

    @GetMapping("all")
    public List<ManufacturerDto> findAll() {
        return manufacturerService.findAll();
    }

    @GetMapping(":id")
    public ManufacturerDto findById(@PathVariable long id) {
        return manufacturerService.findById(id);
    }

    @PostMapping("create")
    public ManufacturerDto create(@RequestBody ManufacturerDto dto) {
        return manufacturerService.create(dto);
    }

    @PutMapping("update")
    public ManufacturerDto update(@RequestBody ManufacturerDto dto) {
        return manufacturerService.update(dto);
    }

    @DeleteMapping("delete")
    public ManufacturerDto delete(@PathVariable long id){
        boolean hasProducts = (productService.findByManufacturer(id) != null);
        if (hasProducts){
            return manufacturerService.delete(id);
        }
        else {
            return null;
        }
    }
}
