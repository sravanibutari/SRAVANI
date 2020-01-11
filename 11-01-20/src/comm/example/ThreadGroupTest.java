package comm.example;

public class ThreadGroupTest {
public static void main(String[]args)
{
	new SimpleThread("a").start();
	new SimpleThread("b").start();
	new SimpleThread("c").start();
	ThreadGroup group=Thread.currentThread().getThreadGroup();
	System.out.println("number of active thread in this group="+group.activeCount());
	Thread[] tarray=new Thread[10];
	int actualSize=group.enumerate(tarray);
	for(int i=0;i<actualSize;i++)
	{
		System.out.println("Thread" + tarray[i].getName() + "in thread group" +group.getName());
	}
	
}
}
