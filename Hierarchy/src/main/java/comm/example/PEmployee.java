package comm.example;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("p_employee")

public class PEmployee extends Employee {
private int psalary;

public PEmployee(String name,int salary,int psalary) {
	super(name,salary);
	this.psalary = psalary;
}

/**
 * @return the psalary
 */
public int getPsalary() {
	return psalary;
}

/**
 * @param psalary the psalary to set
 */
public void setPsalary(int psalary) {
	this.psalary = psalary;
}


}
