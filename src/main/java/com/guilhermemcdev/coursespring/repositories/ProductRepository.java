package com.guilhermemcdev.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermemcdev.coursespring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
