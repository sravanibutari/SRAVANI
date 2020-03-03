package comm.example.hiber;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Task")

public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")

	private int id;
	@Column(name="task_name")
	private String taskName;
	@Column(name="task_author")
	private String taskAuthor;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="todo_id")
	private TODo todo;
	public Task(String taskName, String taskAuthor) {
		super();
		this.taskName = taskName;
		this.taskAuthor = taskAuthor;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}
	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	/**
	 * @return the taskAuthor
	 */
	public String getTaskAuthor() {
		return taskAuthor;
	}
	/**
	 * @param taskAuthor the taskAuthor to set
	 */
	public void setTaskAuthor(String taskAuthor) {
		this.taskAuthor = taskAuthor;
	}
	/**
	 * @return the todo
	 */
	public TODo getTodo() {
		return todo;
	}
	/**
	 * @param todo the todo to set
	 */
	public void setTodo(TODo todo) {
		this.todo = todo;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", taskName=" + taskName + ", taskAuthor=" + taskAuthor + ", todo=" + todo + "]";
	}
	public void setTODo(TODo toDo2) {
		// TODO Auto-generated method stub
		
	}
	
	

}
