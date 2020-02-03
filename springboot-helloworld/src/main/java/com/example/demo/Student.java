package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private String id;
@Column(name="fname")
private String fName;
@Column(name="lname")
private String lName;
@Column(name="email")
private String email;
}
