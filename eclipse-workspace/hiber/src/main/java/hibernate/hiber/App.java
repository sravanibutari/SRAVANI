package hibernate.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.example.hiber.TODo;
import comm.example.hiber.Task;

public class App 
{
    public static void main( String[] args )
    {
        try {
			
        	SessionFactory factory=new Configuration()
					.configure().addAnnotatedClass(Task.class)
					.addAnnotatedClass(TODo.class).buildSessionFactory();
			Session session=factory.openSession();
			Task a=new Task("hibernate","author");
			a.setTODo(new TODo(12,"sravani"));
			session.getTransaction().begin();
			session.save(a);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
    }
}
