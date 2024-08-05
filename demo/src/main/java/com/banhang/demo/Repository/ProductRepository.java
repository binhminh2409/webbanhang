package com.banhang.demo.Repository;

import com.banhang.demo.Entity.Product;
import com.banhang.demo.Entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
