package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.error.CustomerNotFoundException;
import com.example.demo.error.ErrorMessage;
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
	@ExceptionHandler
	public ResponseEntity<ErrorMessage> handleError1(CustomerNotFoundException cne)
	{
		ErrorMessage errorMessage=new ErrorMessage();
		errorMessage.setMessage(cne.getMessage());
		errorMessage.setStatus(HttpStatus.NOT_FOUND.value());
		errorMessage.setErrorTime(System.currentTimeMillis());
		return new ResponseEntity<ErrorMessage>(errorMessage,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorMessage> handleError2(Exception e)
	{
		ErrorMessage errorMessage=new ErrorMessage();
		errorMessage.setMessage(e.getMessage());
		errorMessage.setStatus(HttpStatus.BAD_REQUEST.value());
		errorMessage.setErrorTime(System.currentTimeMillis());
		return new ResponseEntity<ErrorMessage>(errorMessage,HttpStatus.BAD_REQUEST);
	}
@GetMapping("/customers")
public List<Customer> getAll()
{
	return customerService.getAllCustomers();
}
@GetMapping("/customers/{id}")
public Optional<Customer> getCustomerById(@PathVariable Integer id) throws Exception
{
	Optional<Customer> customer=customerService.getCustomerById(id);
	if(!customer.isPresent())
	{
		throw new CustomerNotFoundException("customer not found with id: "+id);
	}
	
	return customer; 
}
@PostMapping("/customers")
public Customer createBook(@RequestBody Customer customer)

{	customer.setId(0);
	return customerService.createCustomer(customer);
}
@PutMapping("/customers")
public Customer updateCustomer(@RequestBody Customer customer)

{	
	return customerService.createCustomer(customer);
}
@DeleteMapping("/customers/{id}")
public void deleteCustomerById(@PathVariable Integer id)
{
	customerService.deleteCustomerById(id);
}
@DeleteMapping("/customers")
public void deleteAll()
{
	customerService.deleteAll();
}
@GetMapping("/customers/findByFName/{fName}")
public List<Customer> findByFName(@PathVariable String fName)
{
	return customerService.findByFName(fName);
}
@GetMapping("/customerss/findByLName/{lName}")
public List<Customer> findByLName(@PathVariable String lName)
{
	return customerService.findByLName(lName);
}
@GetMapping("/customers/findByFNameAndLName/{fName}/{lName}")
public List<Customer> findByFNameAndLName(@PathVariable String fName,@PathVariable String lName)
{
	return customerService.findByFNameAndLName(fName,lName);
}


} 
