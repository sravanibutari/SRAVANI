package hibernate.one_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import comm.example.entity.Instructor;
import comm.example.entity.InstructorDetail;

public class App 
{
    public static void main( String[] args )
    {
    	
        	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
    				.addAnnotatedClass(InstructorDetail.class)
    				.buildSessionFactory();
    		Session session = factory.getCurrentSession();
    		try {
    			int theId = 1;
    			session.getTransaction().begin();
    			InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class, theId);
    			session.getTransaction().commit();
    			System.out.println("tempInstructorDetail: " + tempInstructorDetail);
    			System.out.println("the associatedInstructor: " + tempInstructorDetail.getInstructor());
    			System.out.println("Done!");
    		} catch (Exception e) {
    			e.printStackTrace();
    		} finally {

    			// session.close();

    			factory.close();
    		}
    	}
    }

