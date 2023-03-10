package com.guilhermemcdev.coursespring.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilhermemcdev.coursespring.entities.User;

@RestController
@RequestMapping(value ="/users" )
public class UserResource{
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Afonso", "afonso@gmail.com", "11931453840", "123456");
		return ResponseEntity.ok().body(u);
	}
}
