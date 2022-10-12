package com.dojo.newprojectdojo.services;

import com.dojo.newprojectdojo.entities.Category;
import com.dojo.newprojectdojo.entities.User;
import com.dojo.newprojectdojo.repositories.CategoryRepository;
import com.dojo.newprojectdojo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }
}
