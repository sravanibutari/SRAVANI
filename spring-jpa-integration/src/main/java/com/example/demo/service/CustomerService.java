package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Customer;

public interface CustomerService {
public List<Customer> getAllCustomers();
public Optional<Customer> getCustomerById(Integer id);
}
