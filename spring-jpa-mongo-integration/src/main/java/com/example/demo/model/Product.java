package com.example.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Data;
@Document
@Data
public class Product {
	@Id
	private String id;
	private String Name;
private Category productCategory;

private List<Brand> brandName;

public Product(String id, String name, Category productCategory, List<Brand> brandName) {
	super();
	this.id = id;
	Name = name;
	this.productCategory = productCategory;
	this.brandName = brandName;
}




}
