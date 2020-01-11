package comm.example;

public class MaxPriorityTest {

	public static void main(String[] args) {
		ThreadGroup groupNORM=new ThreadGroup("a grp with normal priority");
		Thread priorityMAX=new Thread(groupNORM,"a thread with maximum priority");
		priorityMAX.setPriority(Thread.MAX_PRIORITY);
		groupNORM.setMaxPriority(Thread.NORM_PRIORITY);
		System.out.format("group's maximum priority=%d&n",groupNORM.getMaxPriority());
		System.out.format("Thread's priority=%d%n",priorityMAX.getPriority());

	}

}
