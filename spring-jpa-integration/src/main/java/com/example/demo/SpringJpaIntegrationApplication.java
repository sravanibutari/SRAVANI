package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.CustomerDAO;
import com.example.demo.entity.Customer;

@SpringBootApplication
public class SpringJpaIntegrationApplication implements CommandLineRunner {
	private CustomerDAO customerDAO;
	@Autowired
	public SpringJpaIntegrationApplication(CustomerDAO customerDAO) {
		super();
		this.customerDAO = customerDAO;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaIntegrationApplication.class, args);
	}
	@Override
	public void run(String...args)throws Exception
	{
	customerDAO.save(new Customer(1,"SR","BU"));
	customerDAO.save(new Customer(2,"A","T"));
	customerDAO.save(new Customer(3,"V","A"));
	customerDAO.save(new Customer(4,"A","R"));
	customerDAO.save(new Customer(5,"NI","I"));
	

}
}