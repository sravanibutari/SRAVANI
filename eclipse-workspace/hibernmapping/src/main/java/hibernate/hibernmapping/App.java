package hibernate.hibernmapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.example.entity.Album;
import comm.example.entity.Image;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = new Configuration().
				configure("hibernate.cfg.xml")
				.addAnnotatedClass(Album.class)
				.addAnnotatedClass(Image.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			int theId = 1;
			session.getTransaction().begin();
			Image tempImage = session.get(Image.class, theId);
			session.getTransaction().commit();
			System.out.println("tempImage: " + tempImage);
			System.out.println("the associated album: " + tempImage.getAlbum());
			System.out.println("Done!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			// session.close();

			factory.close();
		}
	}

    }

