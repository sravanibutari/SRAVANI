package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Customer;


@Repository
@Transactional
public interface CustomerDAO extends JpaRepository<Customer, Integer> {

	public List<Customer> findByFName(String fName);
	public List<Customer> findByLName(String lName);
	
	public List<Customer> findByFNameAndLName(String fName,String lName);
}
