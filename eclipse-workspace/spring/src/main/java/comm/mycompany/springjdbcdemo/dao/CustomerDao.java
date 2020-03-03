package comm.mycompany.springjdbcdemo.dao;

import java.sql.SQLException;

import comm.mycompany.springjdbcdemo.dao.Customer;

public interface CustomerDao {

	public Customer createCustomer(Customer customer) throws SQLException;
}