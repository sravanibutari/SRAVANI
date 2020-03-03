package customer.customer;

import java.util.Set;

public class CustomerService {
private CustomerDao customerDao;
{ 
	customerDao=new CustomerDao();
}
public void addCustomer(int cus_id,String cus_firstname,String cus_lastname,String email)
{
	customerDao.createCustomer(cus_id, cus_firstname, cus_lastname, email);
	System.out.println("customer added successfully");
}
public Set<Customer> getAllCustomers()
{
	return customerDao.getAllCustomers();
}
}
