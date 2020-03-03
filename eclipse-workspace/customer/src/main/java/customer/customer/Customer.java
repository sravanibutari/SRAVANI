package customer.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Customer {
private int cus_id;
private String cus_firstname;
private String cus_lastname;
private String email;
public Customer(int cus_id, String cus_firstname, String cus_lastname, String email) {
	super();
	this.cus_id = cus_id;
	this.cus_firstname = cus_firstname;
	this.cus_lastname = cus_lastname;
	this.email = email;
}
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}

}
