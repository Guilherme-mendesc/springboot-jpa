package com.guilhermemcdev.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermemcdev.coursespring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	

}
