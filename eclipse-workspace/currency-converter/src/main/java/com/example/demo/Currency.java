package com.example.demo;

import javax.persistence.Table;

@Table
public class Currency {

	private double amount;

	
	
	public Currency() {
		super();
	}


	public Currency(double amount) {
		super();
		this.amount = amount;
	}


	public double getAmount() {
		return amount;
	}

	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
