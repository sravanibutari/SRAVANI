package comm1.example;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Test {
	private String taskId;
	private String author;
	private String taskName;

	public void createTask(String author,String taskName) {
		
		setTaskName(taskName);
		setAuthor(author);
		setTaskId(UUID.randomUUID().toString());
	
	}
	
	public String getTaskDetails()
	{
		return "Task Id: "+getTaskId()+
				" Task name: "+getTaskName()+" Created by: "+getAuthor();
	}

}