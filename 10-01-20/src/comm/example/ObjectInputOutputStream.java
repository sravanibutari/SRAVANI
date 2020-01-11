package comm.example;

import java.util.List;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
public class ObjectInputOutputStream {

	public static void main(String[] args) {
BufferedReader reader;
		
		Employee1 myemployee = null;
		List<Employee1> list = new ArrayList<Employee1>();
		try {
			reader = new BufferedReader(new FileReader("todo.in"));

			String line = reader.readLine();
			while (line != null) {
				String str[] = line.split(",");
				myemployee = new Employee1(str[0], str[1], LocalDate.now());
				System.out.println("ToDo to write is: " + myemployee);
				list.add(myemployee);
				line = reader.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			FileOutputStream out = new FileOutputStream("todo.out");
			ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeObject(list);
			oos.flush();
		} catch (Exception e) {
			System.out.println("Problem serializing: " + e);
		}

		try {
			FileInputStream in = new FileInputStream("todo.out");
			ObjectInputStream ois = new ObjectInputStream(in);
			list = (List<Employee1>) (ois.readObject());
		} catch (Exception e) {
			System.out.println("Problem serializing: " + e);
		}
		System.out.println("displaying all todo\n===================\n");
		for(Employee1 t:list)
		{
			System.out.println( t+"\n");
		}
			

	

	}

}
