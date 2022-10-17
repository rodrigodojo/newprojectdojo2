package com.dojo.newprojectdojo.services;

import com.dojo.newprojectdojo.entities.User;
import com.dojo.newprojectdojo.repositories.UserRepository;
import com.dojo.newprojectdojo.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj){
        return userRepository.save(obj);
    }

    public void delete(Long Id){
        try {
            userRepository.deleteById(Id);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

    }

    public User update(Long Id,User obj){
        User user = userRepository.getReferenceById(Id);
        updateData(user,obj);
        return userRepository.save(user);
    }

    private void updateData(User user, User obj) {
        user.setName(obj.getName());
        user.setEmail(obj.getEmail());
        user.setPhone(obj.getPhone());
    }
}
