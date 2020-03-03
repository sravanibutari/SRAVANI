package comm.example.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Post.class)
				.addAnnotatedClass(Commitment.class)
				.buildSessionFactory();


Session session = factory.getCurrentSession();
try {
	int theID=1;
	session.getTransaction().begin();
	Commitment tempCommitment=session.get(Commitment.class,theID);
	session.getTransaction().commit();
	System.out.println("tempCommitment:"+tempCommitment);
	System.out.println("done");
	
} catch (Exception e) {
	e.printStackTrace();
	
}finally
{
	//session.close
	factory.close();
}
    }
}
