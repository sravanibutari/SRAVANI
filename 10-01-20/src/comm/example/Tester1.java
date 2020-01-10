package comm.example;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Tester1 {
	public static void main(String[] args)
	{
		Set<Student1> set=new HashSet<Student1>();
		set.add(new Student1("abc","a",100,0.5));
		set.add(new Student1("efg","b",200,0.5));
		for(Student1 s:set)
		{
			System.out.println(s+"\n");
		}
	}
}
