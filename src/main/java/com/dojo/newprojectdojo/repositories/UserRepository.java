package com.dojo.newprojectdojo.repositories;

import com.dojo.newprojectdojo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
