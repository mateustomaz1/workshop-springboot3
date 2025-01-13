package com.ifpb.edu.couse.services;

import com.ifpb.edu.couse.entities.Category;
import com.ifpb.edu.couse.entities.User;
import com.ifpb.edu.couse.repositories.CategoryRepository;
import com.ifpb.edu.couse.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }

}
