package comm1.example;

import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Todo3 {
	private Tester1 task;
	private RandomFortuneService fortuneService;
	private String todoId;
	private LocalDate date;
	private boolean isCompleted;

	public Todo3(Tester1 task, RandomFortuneService fortuneService) {

		this.task = task;
		this.fortuneService = fortuneService;
	}

	public void createTodo3(String author, String taskName, boolean isCompleted) {
		if (task == null) {
			System.out.println("can't create task existing system");
			System.exit(0);
		}
		if(fortuneService==null)
		{
			System.out.println("bad day today. try again.");
			System.exit(0);
			
		}
		System.out.println("Your Daily Fortune>>> "+fortuneService.getDailyFortune());
		System.out.println("creating a new task.");
		task = new Tester1();
		task.createTester1(author,taskName);
		System.out.println("Sucessfully created task\ncreating new todo..");
		setTodoId(UUID.randomUUID().toString());
		setDate(LocalDate.now());
		setCompleted(isCompleted);

	}

	public String getTodoDetails() {
		return task.getTesterDetails()+ " todo id: " + getTodoId() + " todo date: " + getDate() + " completed: "
				+ isCompleted;
	}

}

