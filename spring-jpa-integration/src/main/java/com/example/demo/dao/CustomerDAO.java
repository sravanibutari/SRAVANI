package com.example.demo.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Customer;
@Repository
@Transactional
public interface CustomerDAO extends JpaRepository<Customer, Integer> {

}
