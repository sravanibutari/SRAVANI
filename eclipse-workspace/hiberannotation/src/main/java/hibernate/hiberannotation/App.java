package hibernate.hiberannotation;

import java.io.IOException;
import java.time.LocalDate;

import comm.example.entity.Person;
import comm.example.service.PersonService;
import comm.example.service.PersonServiceImpl;

public class App 
{
    private static PersonService service;
    static
    {
    	service=new PersonServiceImpl();
    }
    public static void main(String[] args)throws IOException
    {
    /*	Person p=service.createPerson(new Person("U100","a",LocalDate.now()));
    	System.out.println(p);*/
    	Person p1=service.updatePerson(2);
    	System.out.println(p1);
    	
    }
}
