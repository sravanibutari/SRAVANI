package com.example.demo.error;
@SuppressWarnings("serial")
public class CustomerNotFoundException extends RuntimeException {
	private String message;

	public CustomerNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
}
