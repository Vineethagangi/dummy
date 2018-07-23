package com.cg.spring.boot.jpa.springbootdatajpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	
	
	@Autowired
	ProductRepository productRepo;
	
	public List<Product> getAllProducts(){
		List<Product> products=new ArrayList<>();
		productRepo.findAll().forEach(products::add); //select all from table
		return products;
		
		
	}

	public Optional<Product> getProduct(String id){
		
		return productRepo.findById(id); //gets single record
		
	}
	
	public void addProduct(Product p) {
		productRepo.save(p); //insert into product values
	}

	public void updateProduct(Product p,String id) {
		productRepo.save(p); //update into product values
	}

	
	
	public void deleteProduct(String id) {
		productRepo.deleteById(id);   //delete single record by id
	}
	
}






