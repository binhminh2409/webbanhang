package com.banhang.demo.Controller;

import com.banhang.demo.Dto.ManufacturerDto;
import com.banhang.demo.Dto.ProductDto;
import com.banhang.demo.Entity.Product;
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

    @PostMapping("create")
    public ManufacturerDto create(@RequestBody ManufacturerDto dto) {
        return manufacturerService.create(dto);
    }

    @DeleteMapping("delete")
    public ManufacturerDto delete(@PathVariable long id){
        List<ProductDto> products = productService.findAll();
        for product in products:

        return productService.delete();
    }
}
