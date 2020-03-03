package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.User;
@Service
@EnableTransactionManagement
public class UserServiceImpl implements UserService{
@Autowired
private UserService userservice;


	@Override
	@Transactional
	public User CreateUser(User user) {
		// TODO Auto-generated method stub
		return userservice.CreateUser(user);
	}

	@Override
	@Transactional
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userservice.getAllUsers();
	}


}
