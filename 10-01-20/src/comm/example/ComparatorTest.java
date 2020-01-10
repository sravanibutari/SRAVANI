package comm.example;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorTest {
	public static void main(String[] args) {
		Comparator c = new NameComp();
		c=new GpaComparator();
		Set<Student1> studentSet = new TreeSet<Student1>(c);
		
		studentSet.add(new Student1("Mike", "Hauffmann", 101, 4.0));
		studentSet.add(new Student1("John", "Lynn", 102, 2.8));
		studentSet.add(new Student1("Jim", "Max", 103, 3.6));
		studentSet.add(new Student1("Kelly", "Grant", 104, 2.3));
		Object[] studentArray = studentSet.toArray();
		Student1 s;
		for (Object obj : studentArray) {
			s = (Student1) obj;
			System.out.printf("Name = %s %s ID = %d GPA = %.1f\n", s.getFirstName(), s.getLastName(), s.getStudentID(),
					s.getGPA());
		}
	}
}