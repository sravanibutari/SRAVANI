package comm.example;

public class Excep {

	public static void main(String[] args) {
	 new Excep().doTheWork();
}
	
public void doTheWork()
{
	Object o=null;
	for(int i=0;i<5;i++)
	{
		try {
			o=makeObj(i);
		}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();
System.err.println("IllegalArgumentException is caught:("+e.getMessage()+").");
return;
		}
		System.out.println(o);
	}
}

private Object makeObj(int type)throws IllegalArgumentException {
	
	if(type==1) 
			throw new IllegalArgumentException("don't type like"+type);
	return new Object();
}
}
