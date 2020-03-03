package comm.example.util;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.security.auth.login.Configuration;

import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;

import comm.example.entity.Person;

public final class HibernateUtil {
	private static SessionFactory factory;
	static
	{
		Logger logger=Logger.getLogger("org.hibernate");
		logger.setLevel(Level.OFF);
		factory=new Configuration().Configure().addAnnotatedClass(Person.class).buildSessionFactory();
	}
	private HibernateUtil()
	{
		
	}
	public static Session getSession()
	{
		return factory.openSession();
	}

}
