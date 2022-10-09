package com.dojo.newprojectdojo.controller;

import com.dojo.newprojectdojo.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L,"rodrigo teste","rodrigo@test.com","123456789","xpto");
        return ResponseEntity.ok().body(u);
    }
}
