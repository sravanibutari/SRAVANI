package comm.example;

public class SimpleThread extends Thread {
	public SimpleThread(String str)
	{
	super();
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println(i+" "+getName()+ "priority="+getPriority());
		}
		System.out.println("Done!"+getName());
	}

	

}
