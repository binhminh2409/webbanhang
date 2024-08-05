package com.banhang.demo.Controller;

import com.banhang.demo.Dto.ProductDto;
import com.banhang.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/manufacturer/")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping(":id")
    public ProductDto findById(@PathVariable long id) {
        return productService.findById(id);
    }

    @PostMapping("create")
    public ProductDto create(@RequestBody ProductDto dto) {
        return productService.create(dto);
    }

    @PutMapping("update")
    public ProductDto update(@RequestBody ProductDto dto) {
        return productService.update(dto);
    }

    @DeleteMapping("delete")
    public ProductDto delete(@PathVariable long id){
        return productService.delete(id);
    }
}
