package comm.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnectionFactory {
	private static  Connection connection;
	 static MySqlConnectionFactory myConnection;
	
	
	private MySqlConnectionFactory()
	{
		
	}
	
	
	public static MySqlConnectionFactory getMyConnectionObject()
	{
		if(myConnection==null)
			{
			return new MySqlConnectionFactory();
		}
		else {
			return myConnection;
		}
	}
	
	public static  Connection getMyConnection() throws SQLException
	{
		
		
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","welcome");
		return connection;
	}

}