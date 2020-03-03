package hibernate.hibernmapping;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.google.protobuf.Service;

import comm.example.ServiceImpl;
import comm.example.entity.Album;
import comm.example.entity.Image;


public class AppTest 
{
    public static Service service;
    static
    {
    	service=(Service) new ServiceImpl();
    }
    public static void main(String[] args)throws IOException
    {
    	int choice=-1;
    	SessionFactory factory=new Configuration().configure().addAnnotatedClass(Album.class).addAnnotatedClass(Image.class).buildSessionFactory();
    Session session=factory.getCurrentSession();
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int tid;
    do
    {
    	System.out.println("1.create album/image");
    	System.out.println("2.delete album/image");
    	System.out.println("3.enter choice");
    	choice=Integer.parseInt(br.readLine());
    	switch(choice)
    	{
    	case 1:
    		Album tempAlbum=new Album("personal");
    		Image tempImage=new Image("//sshkdh");
    		tempAlbum.setImage(tempImage);
    		session.beginTransaction();
    		session.save(tempAlbum);
    	session.getTransaction().commit();	
    	case 2:
    		session.beginTransaction();
    		System.out.println("enter id:");
    		tid=Integer.parseInt(br.readLine());
   Album tempAlbum1=session.get(Album.class,tid);
   if(tempAlbum1!=null)
   {
	   session.delete(tempAlbum1);
   }
   session.getTransaction().commit();
    	}
    	
    }
    while(choice!=0);
    }
    
}
