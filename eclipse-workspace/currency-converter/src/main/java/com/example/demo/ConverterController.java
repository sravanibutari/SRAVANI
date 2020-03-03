package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping("/")
public class ConverterController {
	
	
	@GetMapping("/usd")
	public double getUSD(double amount) {
	double usd=69* amount;
	return usd;
	}
	
	@GetMapping("/inr")
	public double getINR(double amount) {
		double inr=amount/69;
		return inr;
	}
	

}
