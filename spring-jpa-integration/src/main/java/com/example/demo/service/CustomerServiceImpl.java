package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.CustomerDAO;
import com.example.demo.entity.Customer;
@Service
@EnableTransactionManagement
public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO customerDAO;

	@Autowired
	public CustomerServiceImpl(CustomerDAO customerDAO) {
		super();
		this.customerDAO = customerDAO;
	}

	@Override
	@Transactional
	public List<Customer> getAllCustomers() {
		
		return customerDAO.findAll();
	}

	@Override
	@Transactional
	public Optional<Customer> getCustomerById(Integer id) {
		Optional<Customer> customer=customerDAO.findById(id);
		return customer;
	}

}
