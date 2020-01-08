package comm.example;

public class Test {
public static void main(String[] args) throws EmployeeNotCreatedException
{
	Employee e=new Employee();
	e.createEmployee(2, "George", "abc", 1);
System.out.println(e);
}
}
