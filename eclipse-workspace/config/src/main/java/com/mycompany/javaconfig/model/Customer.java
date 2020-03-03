package com.mycompany.javaconfig.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Customer {
private String uid;
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
	// TODO Auto-generated method stub
	return String.format("%-20s,%-20s,%-20s,%-20s",uid,firstname,lastname,email);
}

}
