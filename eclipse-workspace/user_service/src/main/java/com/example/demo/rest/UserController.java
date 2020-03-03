package com.example.demo.rest;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserDAO;
import com.example.demo.model.User;


@RestController
@RequestMapping("/api")
public class UserController {
	private UserDAO dao;
	 
@PostMapping("/users")
public User CreateUser(User user) {
	return dao.save(user);
}
@GetMapping("/users")
public List<User> getAllUsers(){
	return dao.findAll();
}
}
