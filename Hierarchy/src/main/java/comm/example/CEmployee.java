package comm.example;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("c_employee")

public class CEmployee extends Employee{
private String work;
private int dwage;

public CEmployee(String name,int salary,String work, int dwage) {
	super(name,salary);
	
	this.work = work;
	this.dwage = dwage;
}
/**
 * @return the work
 */
public String getWork() {
	return work;
}
/**
 * @param work the work to set
 */
public void setWork(String work) {
	this.work = work;
}
/**
 * @return the dwage
 */
public int getDwage() {
	return dwage;
}
/**
 * @param dwage the dwage to set
 */
public void setDwage(int dwage) {
	this.dwage = dwage;
}

}
