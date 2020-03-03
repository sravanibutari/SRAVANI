package com.mycompany.javaconfig;

import com.mycompany.javaconfig.model.Customer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mycompany.javaconfig.config.CustomerConfig;



public class App {
public static void main(String[] args)
{
	AnnotationConfigApplicationContext context=
 		   new AnnotationConfigApplicationContext(CustomerConfig.class);
    Customer c=context.getBean("customer",Customer.class);
    c.setUid("100");
    c.setFirstname("John");
    c.setLastname("Doe");
    c.setEmail("john@email.com");
    System.out.println(c);
 	
 
}
}
