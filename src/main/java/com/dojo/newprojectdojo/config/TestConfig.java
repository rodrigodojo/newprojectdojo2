package com.dojo.newprojectdojo.config;

import com.dojo.newprojectdojo.entities.User;
import com.dojo.newprojectdojo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null,"rodrigo teste","rodrigo@test.com","123456789","xpto");
        User u2 = new User(null,"rodrigo teste 2","rodrigo2@test.com","000000000","xpto2");

       userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
