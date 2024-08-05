package com.banhang.demo.Repository;

import com.banhang.demo.Entity.Manufacturer;
import com.banhang.demo.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {
}
