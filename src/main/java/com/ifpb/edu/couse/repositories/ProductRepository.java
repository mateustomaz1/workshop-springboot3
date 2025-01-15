package com.ifpb.edu.couse.repositories;

import com.ifpb.edu.couse.entities.Category;
import com.ifpb.edu.couse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
