package comm.mycompany.springjdbcdemo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.activation.DataSource;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class CustomerDaoImpl implements CustomerDao {
	private DataSource dataSource;
	private Connection connection;
	private PreparedStatement pstatement;
	private static Logger logger=Logger.getLogger("comm.mycompany.springjdbcdemo.dao.CustomerDaoImpl");
	@Autowired
	public CustomerDaoImpl(DataSource dataSource) 
	{
		super();
		this.dataSource=dataSource;
	}
@PostConstruct
public void init()
{
	try
	{
		logger.info("create connection");
		connection=dataSource.getConnection();
		logger.info("connection established");
	}catch(SQLException e)
	{
		e.printStackTrace();
		logger.info("connection unsuccessful");
	}

}
@Override
public Customer createCustomer(Customer customer)throws SQLException
{
	pstatement= connection.prepareStatement("insert into customer(uid,firstname,lastname,email)values(?,?,?,?)");
	pstatement.setString(1,customer.getUid());
	pstatement.setString(2,customer.getFirstname());
	pstatement.setString(3,customer.getLastname());
	pstatement.setString(4,customer.getEmail());
	pstatement.executeUpdate();
	return customer;
}
}
