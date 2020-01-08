package comm1.example;

import java.util.Scanner;

public class Tester3 {
	
	private static final int MAX=5;
	
	
	private static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		int counter=-1;
		Todo4 todos[]=new Todo4[MAX];
		int choice=0;
		Todo4 todo=new Todo4();
		Todo4 tempTodo=null;
		do {
			System.out.println("1.add new todo.");
			System.out.println("2.display all todo");
			System.out.println("0. exit");
			System.out.print("slect your choice: ");
			choice=scanner.nextInt();
			switch (choice) {
			case 1:
				if(counter==MAX-1)
				{
					System.out.println("Cant not create more todo...");
					break;
				}
				System.out.print("task author: ");
				String author=scanner.next();
				System.out.print("task name: ");
				String taskName=scanner.next();
				System.out.print("Is Completed? ");
				boolean isCompleted=scanner.nextBoolean();
				tempTodo=todo.createTodo(author, taskName, isCompleted);
				todos[++counter]=tempTodo;
				break;
			case 2:
				for(int i=0;i<=counter;i++)
				{
					System.out.println("\n"+todos[i].getTodoDetails());
				}
				break;
			case 0:
				System.exit(0);
				System.out.println("bye!!!!");

			default:
				System.out.println("invalid choice");
				break;
			}
		} while (choice !=0);
	
		/*
		 * Todo4 todo4=new Todo4(new Task(),new RandomFortuneSeervice());
		 * todo.createTodo("John", "Learning Angular", false);
		 * System.out.println(todo.getTodoDetails());
		 */
	}

}