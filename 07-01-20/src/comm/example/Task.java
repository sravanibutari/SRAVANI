package comm.example;
import java.time.LocalDate;

public class Task {
	private String taskId;
	private String taskName;
	private LocalDate taskDate;
    private boolean isCompleted;
    public Task()
    {
    	super();
    }
   // public Task(String taskId,String taskName,LocalDate taskDate,String isCompleted)
    
	public Task(String taskId, String taskName, LocalDate taskDate, boolean isCompleted) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskDate = taskDate;
		this.isCompleted = isCompleted;
	}

	
	@Override
	public String toString() {
	 return "Task Details: \n TaskId:" +taskId+ "TaskName:" +taskName+ "TaskDate:" +taskDate+ "isCompleted:" +isCompleted;
		
	}

	
	

	@Override
	public boolean equals(Object obj) {
	Task theTask=null;
	boolean isEqual=false;
	if (obj instanceof Task) {
		theTask = (Task) obj;
	}
	if((this.getTaskName()==theTask.getTaskName()) &&
			(this.getTaskDate()==theTask.getTaskDate()) &&(this.getIsCompleted()==theTask.getIsCompleted()))
	{
		isEqual=true;
	}
	return isEqual;

	}

	@Override
	public int hashCode() {
	
		return super.hashCode();
}
	
	public String getTaskId() {
		return taskId;
	}

	/**
	 * @param taskId the taskId to set
	 */
	public void setTaskId(String taskId) {
		this.taskId = taskId;
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
	 * @return the taskDate
	 */
	public LocalDate getTaskDate() {
		return taskDate;
	}

	/**
	 * @param taskDate the taskDate to set
	 */
	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}

	/**
	 * @return the isCompleted
	 */
	public boolean getIsCompleted() {
		return isCompleted;
	}

	/**
	 * @param isCompleted the isCompleted to set
	 */
	public void setIsCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	
}
