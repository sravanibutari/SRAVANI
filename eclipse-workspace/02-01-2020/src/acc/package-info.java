package acc;
import Account;
import accType;
public class Tester
{
	private static java.util.Scanner scanner=new Scanner(System.in);
	public static void main(String[] args)
	{
		int choice=1;
		acc ac=null;
		do
		{
		System.out.println("1.create account");
		System.out.print("2.display account");
		System.out.println("0.exit");
		System.out.println("choice your choice>>>:");
		choice=scanner.nextInt();
		switch(choice)
		{
		case 1:
			acc=ac.createacc(acType.CREDIT_CARD,10000);
			break;
		case 2:
			System.out.println(ac.displayacc);
			break;
		case 0:
			System.out.println("existing from the system...");
			System.exit(0);
default:
	System.out.println("invalid choice...");
	break;
		}
		
			
	}
		while(choice!=0);
}
}