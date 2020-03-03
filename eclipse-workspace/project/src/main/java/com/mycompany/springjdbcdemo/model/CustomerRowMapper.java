package com.mycompany.springjdbcdemo.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;

public class CustomerRowMapper implements RowMapper<Customer> {
	@Override
	public Customer mapRow(ResultSet rs,int rowNUM)throws SQLException
	{
		Customer customer=new Customer();
		customer.setUid(rs.getString("uid"));
		customer.setFirstname(rs.getString("first_name"));
		customer.setLastname(rs.getString("last_name"));
		customer.setEmail(rs.getString("email"));
		return customer;
	}

}
