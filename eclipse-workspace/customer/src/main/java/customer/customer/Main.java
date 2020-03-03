package customer.customer;
import java.util.*;
public class Main {
public static void main(String[] args)
{
String name[]= {	
   new String("a"),
   new String("b"),
   new String("c"),
   };
List<String> l = Arrays.asList(name);
System.out.println("before shuffling="+1);

Collections.shuffle(l);
System.out.println("after shuffling="+l);

Collections.sort(l);
System.out.println("after sort="+l);
}
}