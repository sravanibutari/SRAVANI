package comm.example.jdbc;

import java.sql.SQLException;
import java.util.List;

public class EmployeeServiceImpl1 implements EmployeeService1 {
	private EmployeeDAO1 dao;
	
	{
		dao=new EmployeeDAOImpl1();
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}

}