package com.banhang.demo.Repository;

import com.banhang.demo.Entity.Product;
import com.banhang.demo.Entity.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByManufacturer(Manufacturer manufacturer);
}
