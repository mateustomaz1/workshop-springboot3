package com.ifpb.edu.couse.services;

import com.ifpb.edu.couse.entities.Product;
import com.ifpb.edu.couse.entities.User;
import com.ifpb.edu.couse.repositories.ProductRepository;
import com.ifpb.edu.couse.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

}
