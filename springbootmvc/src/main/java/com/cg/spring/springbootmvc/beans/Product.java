package com.cg.spring.springbootmvc.beans;

import java.math.BigDecimal;

public class Product {

	private int id;
	private String name;
	private String model;
	private BigDecimal price;
	public Product(int id, String name, String model, BigDecimal price) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public Product() {
		
	}
	
	
	
	
	
}
