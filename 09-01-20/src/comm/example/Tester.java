package comm.example;

import java.util.Set;

public class Tester {
	public static Customerservice customerService;
	static
	{
		customerService=new Customerservice();
	}
	public static void main(String[] args) {
	    
		customerService.addCustomer(110, "Sravani", "Butari", "Sravani@love2eat.com");
		customerService.addCustomer(100, "Dhoni", "MahendraSingh", "Dhoni@love2playcricket.com");
		
		
		Set<Customer> set=customerService.getAllCustomers();
		System.out.println(set);
		}
}
