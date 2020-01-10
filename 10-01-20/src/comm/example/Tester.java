package comm.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

public class Tester {

	public static void main(String[] args) {
		Set<Student> set=new HashSet<Student>();
		set.add(new Student(UUID.randomUUID().toString(),"sravani","butari",80));
		set.add(new Student(UUID.randomUUID().toString(),"a","b",82));
		set.add(new Student(UUID.randomUUID().toString(),"n","i",75));
	/*	Iterator a=set.iterator();
		while(a.hasNext())
		{
			Student s= set.next();
			System.out.println(s+"");
		}
		System.out.println();
	}
*/
		for(Student s:set)
		{
			System.out.println(s+"\n");
		}
}
}
