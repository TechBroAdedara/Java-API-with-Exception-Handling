package com.adedara.flexisafinternship.repositories;

import com.adedara.flexisafinternship.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Additional query methods if needed
}
