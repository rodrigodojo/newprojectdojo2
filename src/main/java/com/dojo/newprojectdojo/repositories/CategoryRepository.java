package com.dojo.newprojectdojo.repositories;

import com.dojo.newprojectdojo.entities.Category;
import com.dojo.newprojectdojo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
