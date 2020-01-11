package comm.example;

import java.util.Comparator;

public class AgeCompare implements Comparator{
public int compare(Object x,Object y)
{
	Employee e1=(Employee)x;
	Employee e2=(Employee)y;
	if(e1.getAge()==e2.getAge())
	{
		return e1.getDateOfJoining().compareTo(e2.getDateOfJoining());
	}
	else if(e1.getAge()==e2.getAge())
	{
		return 1;
	}
	else
		return -1;
}
}
