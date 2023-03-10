package com.guilhermemcdev.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermemcdev.coursespring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
