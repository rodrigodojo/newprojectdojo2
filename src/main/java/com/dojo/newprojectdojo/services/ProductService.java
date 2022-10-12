package com.dojo.newprojectdojo.services;

import com.dojo.newprojectdojo.entities.Product;
import com.dojo.newprojectdojo.entities.User;
import com.dojo.newprojectdojo.repositories.ProductRepository;
import com.dojo.newprojectdojo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }
}
