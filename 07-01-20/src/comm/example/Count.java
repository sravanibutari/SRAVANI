package comm.example;

public class Count {

	private static Integer count;
	private String temp;
	
	private final int MAX;
	
	
	class InnerCounter{
		public void add(int a,int b)
		{
			System.out.println("\n"+(a+b));
		}
	}
	
	public Count() {
		super();
		MAX=1000;
	}
	

	
	static {
		count = 0;
	}

	public Count(String temp) {
		super();
		MAX=100;
		count++;
		this.temp = temp;
	}

	@Override
	public String toString() {
		return "Count of object is: " + temp + count;
	}

	public static String displayCount() {
		return count.toString();
	}
	
	public void displayMAX()
	{
		System.out.println(MAX);
	}

}