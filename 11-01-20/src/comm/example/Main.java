package comm.example;

public class Main {
	public Main() {
	}

	public static void main(String[] a) {
		Monitor mon = new Monitor();
		
		Thread p1 = new Thread(new Producer(mon), "p1");
		Thread c1 = new Thread(new Consumer(mon), "c1");
		c1.start();
		p1.start();
		
		

	}
}
