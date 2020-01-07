package comm.example;

public class Tester {
public static void main(String[] args)
{
	Count c=new Count();
	Count.InnerCounter iCounter=c.new InnerCounter();
	iCounter.add(50,100 );
	c.displayMAX();
}
}
