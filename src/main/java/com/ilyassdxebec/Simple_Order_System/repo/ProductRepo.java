package com.ilyassdxebec.Simple_Order_System.repo;

import com.ilyassdxebec.Simple_Order_System.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
}
