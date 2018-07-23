package com.cg.spring.boot.jpa.springbootdatajpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	
	
	@Autowired // to inject object which is automatically created by spring for the service class
	ProductService productService;
	
	
	
	@RequestMapping("/products")
public List<Product> getAllProducts(){
	return productService.getAllProducts();
	
}

@RequestMapping("/products/{id}")
public Optional<Product> getProduct(@PathVariable String id){
	return productService.getProduct(id);
}

@RequestMapping(method=RequestMethod.POST,value="/products")
public void addProduct(@RequestBody Product p) {
	
	productService.addProduct(p);
	
}
	@RequestMapping(method=RequestMethod.PUT,value="/products/{id}")
	public void updateProduct(@RequestBody Product p, @PathVariable String id) {
		
		productService.updateProduct(p, id);
		
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE,value="/products/{id}")
	 
	public void deleteProduct(@PathVariable String id) {
		productService.deleteProduct(id);
	
	
	
	
}













}
