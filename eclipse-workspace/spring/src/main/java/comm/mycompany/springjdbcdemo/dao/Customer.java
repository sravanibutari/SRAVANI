package comm.mycompany.springjdbcdemo.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Customer {
private int uid;
private String firstname;
private String lastname;
private String email;
public Customer(String firstname, String lastname, String email) {
	super();
	
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
}
@Override
public String toString() {
	return "Customer [uid=" + uid + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
}

}
