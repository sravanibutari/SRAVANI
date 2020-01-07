package comm.example;

public class BoxingUnboxingDemo {
	private Integer wInt;
	private int pInt;
	public BoxingUnboxingDemo(Integer wint,int pInt)
	{
		super();
		this.wInt=wInt;
		this.pInt=pInt;
	}
	@Override
	public String toString() {
		
		return "BoxingUnboxingDemo [wInt=" +wInt + "  pInt=" +pInt + "]";
	}
public void display()
{
	Integer tempP=wInt; 
	int tempW=pInt; 
	System.out.println(this);
	System.out.printf("After Auto Boxing/unboxing: %d %d ",wInt,pInt);
}
}
