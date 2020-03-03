package comm.example;

import java.util.UUID;

public class Employee {
private int employeeId;
private String employeeName;
private String employeeAddress;
private static double employeeExp;
/**
 * @return the employeeId
 */
public int getEmployeeId() {
	return employeeId;
}
/**
 * @param employeeId the employeeId to set
 */
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
/**
 * @return the employeeName
 */
public String getEmployeeName() {
	return employeeName;
}
/**
 * @param employeeName the employeeName to set
 */
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
/**
 * @return the employeeAddress
 */
public String getEmployeeAddress() {
	return employeeAddress;
}
/**
 * @param employeeAddress the employeeAddress to set
 */
public void setEmployeeAddress(String employeeAddress) {
	this.employeeAddress = employeeAddress;
}
/**
 * @return the employeeExp
 */
public  double getEmployeeExp() {
	return employeeExp;
}
/**
 * @param employeeExp the employeeExp to set
 */
public void setEmployeeExp(double employeeExp) {
	Employee.employeeExp = employeeExp;
}

public Employee(int employeeId, String employeeName, String employeeAddress, double employeeExp) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeAddress = employeeAddress;
	Employee.employeeExp = employeeExp;
}


public Employee(String string, String employeeName2, String employeeAddress2) {
	// TODO Auto-generated constructor stub
}

public Employee createEmployee(int employeeId, String employeeName, String employeeAddress, double employeeExp) throws EmployeeNotCreatedException
{
	Employee employee = new Employee(UUID.randomUUID().toString(),employeeName
			,employeeAddress);
	if(employee.getEmployeeExp()<2)
	{
		throw new EmployeeNotCreatedException(employeeAddress);
	}
	return employee;
	
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [EmployeeId=" + employeeId + ",EmployeeName=" + employeeName
			+ ", EmployeeAddress=" + employeeAddress + ", EmployeeExp=" + employeeExp + "]";
}

}
