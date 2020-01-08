package comm1.example;

public class Tester {

	public static void main(String[] args) {
		ToDo todo=new ToDo();
		todo.createTodo("John", "Learning Angular", false);
		System.out.println(todo.getTodoDetails());
	}

	}


