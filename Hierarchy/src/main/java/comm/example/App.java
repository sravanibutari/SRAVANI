package comm.example;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Session session=null;
		try {
			
			session=new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(Employee.class)
					.addAnnotatedClass(CEmployee.class)
					.addAnnotatedClass(PEmployee.class).buildSessionFactory()
					.getCurrentSession();
    	Employee e1=new Employee("sravani",1);
    	Employee e2=new CEmployee("abc",2, "mno", 1);
    	Employee e3=new PEmployee("hier", 1, 2);
    	session.getTransaction().begin();
    	session.save(e1);
    	session.save(e2);
    	session.save(e3);
    	session.getTransaction().commit();
    	System.out.println("done");
    	}finally {
    		//session.close();
    	}
}
}