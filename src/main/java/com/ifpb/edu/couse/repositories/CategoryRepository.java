package com.ifpb.edu.couse.repositories;

import com.ifpb.edu.couse.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}
