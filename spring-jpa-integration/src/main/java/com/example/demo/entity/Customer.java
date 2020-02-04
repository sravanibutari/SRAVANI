package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
	@Column(name="FirstName")
private String Fname;
	@Column(name="LastName")
private String lName;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFname() {
	return Fname;
}

public void setFname(String fname) {
	Fname = fname;
}

public String getlName() {
	return lName;
}

public void setlName(String lName) {
	this.lName = lName;
}


}
