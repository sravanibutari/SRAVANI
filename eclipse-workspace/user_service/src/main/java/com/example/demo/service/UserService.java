package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
public User CreateUser(User user);
public List<User> getAllUsers();
}
