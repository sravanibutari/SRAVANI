package comm.example;

public class ThreadsPriority {

	public static void main(String[] args) {
		Thread t1=new SimpleThread("a");
		t1.start();
		t1.setPriority(10);
		
		Thread t2=new SimpleThread("b");
		t2.start();
		t2.setPriority(5);
		
		Thread t3=new SimpleThread("c");
		t3.start();
		t3.setPriority(1);
	}

}
