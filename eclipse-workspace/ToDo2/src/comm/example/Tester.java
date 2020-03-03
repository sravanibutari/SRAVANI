package comm.example;

import java.util.List;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
public class Tester {
private static Scanner scanner=new Scanner(System.in);
private ToDoService service=null;
{
	service=new ToDoServiceImpl();
}

public static void main(String[]args)
{
	Tester t=new Tester();
	int choice=0;
	do
	{
		System.out.println("1.create todo");
		System.out.println("2.display all todo");
		System.out.println("3.find todo");
		System.out.println("4.remove todo");
		System.out.println("5.remove todo");
		System.out.println("0.exit:");
		System.out.println("Enter Your Choice");
		try
		{
			choice=scanner.nextInt();
		}
		catch(InputMismatchException e)
		{
		System.out.println(e.toString());
		}
		switch(choice)
		{
			
		   case 1:
				System.out.println("provide task name: ");
				ToDo toDo = t.service.createToDo(scanner.next());
				System.out.println("TODO Created sucessfully: " + toDo);
				break;
			case 2:
				List<ToDo> list = t.service.getAllToDos();
				for (ToDo t1 : list) {
					System.out.println(t1 + "\n");
				}

				break;
			case 3:
				System.out.print("provide todo Id: ");
				ToDo toDo1 = t.service.findById(scanner.next());
				if (toDo1 != null) {
					System.out.println(toDo1);
				} else {
					System.out.println("no such todo available");
				}
				break;
			case 4:
				
				System.out.print("provide todo Id: ");
				t.service.deleteToDo(scanner.next());
				break;
			case 5:
				t.service.removeAllToDo();
				System.out.println("batch remove sucessfull");
				break;
			case 0:
				System.out.println("bye");
				System.exit(0);
				break;

			default:
				System.out.println("invalid choice");
				break;
			}

		} while (choice != 0);

}
}








