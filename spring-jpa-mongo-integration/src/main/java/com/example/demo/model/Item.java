package com.example.demo.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;


import lombok.Data;


@Document
@Data

public class Item {
	@Id
private String itemId;
private String itemName;
private double itemPrice;
@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd-mm-yyyy")
private LocalDate dateOfBirth;

public Item(String itemName, double itemPrice, LocalDate dateOfBirth) {
	super();
	this.itemName = itemName;
	this.itemPrice = itemPrice;
	this.dateOfBirth = dateOfBirth;
}

}
