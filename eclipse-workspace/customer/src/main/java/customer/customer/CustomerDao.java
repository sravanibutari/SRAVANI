package customer.customer;

import java.util.HashSet;
import java.util.Set;

public class CustomerDao {
private Set<Customer> customerSet=null;
{
	customerSet=new HashSet<Customer>();
}
public void createCustomer(int cus_id,String cus_firstname,String cus_lastname,String email)
{
	customerSet.add(new Customer(cus_id,cus_firstname,cus_lastname,email));
}
public Set<Customer> getAllCustomers()
{
	return customerSet;
}
}
