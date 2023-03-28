package com.guilhermemcdev.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermemcdev.coursespring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
