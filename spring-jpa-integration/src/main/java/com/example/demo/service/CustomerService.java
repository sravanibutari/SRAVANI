package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Customer;

public interface CustomerService {
public List<Customer> getAllCustomers();
public  Optional<Customer> getCustomerById(Integer id);
public Customer createCustomer(Customer customer);
public void deleteCustomerById(Integer id);
public void deleteAll();
public List<Customer> findByFName(String fName);
public List<Customer> findByLName(String lName);
public List<Customer> findByFNameAndLName(String fName,String lName);

}

