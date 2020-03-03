package comm.example.jdbc;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO1 {

	public List<Employee> getAllEmployees() throws SQLException;
	
}