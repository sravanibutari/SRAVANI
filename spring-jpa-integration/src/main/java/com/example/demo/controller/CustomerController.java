package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {
	private CustomerService customerService;
 @Autowired
	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
@GetMapping("/customers")
public List<Customer> getAll()
{
	return customerService.getAllCustomers();
}
@GetMapping("/customers/{id}")
public Optional<Customer> getBookById(@PathVariable Integer id)
{
	return customerService.getCustomerById(id);
}

} 
