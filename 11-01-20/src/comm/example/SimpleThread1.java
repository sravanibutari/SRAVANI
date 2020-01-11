package comm.example;

public class SimpleThread1 extends Thread {
	public SimpleThread1(String str)
	{
		super(str);
	}
public void run()
{
	for(int i=0;i<5;i++)
	{
		try
		{
			sleep((long)(Math.random()*1000));
		}catch(InterruptedException e) { }
	}
	System.out.format("done %s %n", getName());
	
}
}
