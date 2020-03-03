package comm.example.spring.hibernate.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import comm.example.spring.hibernate.demo.entity.UserDetail;

public class App 
{

    public static void main( String[] args )
    {
        
    	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDetail ud=context.getBean("ud",UserDetail.class);
        UserService us=context.getBean("us",UserService.class);
        UserDao ud1=context.getBean("ud1",UserDao.class);
      
        ud.setId(2);
        ud.setEmail("abc@gmail.com");
        ud.setUserId("c2");
        ud.setUserName("sravani");      
         System.out.println(ud);
        
         /*
    	ClassPathXmlApplicationContext context=null;
    	BufferedReader br=null;
    	UserService service=null;	
    	
    	try {
    		br=new BufferedReader(new InputStreamReader(System.in));
			context=new ClassPathXmlApplicationContext("applicationContext.xml");
			service=context.getBean("service",UserService.class);
    	*/
    }
}





















