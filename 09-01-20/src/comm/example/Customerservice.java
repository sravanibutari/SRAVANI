package comm.example;

import java.util.Set;

public class Customerservice {
	private CustomerDio customerDio;
	{
		customerDio=new CustomerDio();
	}
	public void addCustomer(int customerId,String firstName,String lastName,String email)
	{
		customerDio.createCustomer(customerId, firstName, lastName, email);
		System.out.println("Customer Added sucessfully.");
	}
	public Set<Customer> getAllCustomers()
	{
		return customerDio.getAllCustomers();
	}

}
