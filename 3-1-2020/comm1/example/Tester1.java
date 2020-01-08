package comm1.example;

public class Tester1 {

	public static void main(String[] args) {
		Todo3 todo=new Todo3(new Tester1(),new RandomFortuneService());
		todo.createTodo3("John", "Learning Angular", false);
		System.out.println(todo.getTodoDetails());
	}

}