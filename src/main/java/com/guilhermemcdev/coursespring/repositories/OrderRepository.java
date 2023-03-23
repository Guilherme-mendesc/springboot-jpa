package com.guilhermemcdev.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermemcdev.coursespring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
