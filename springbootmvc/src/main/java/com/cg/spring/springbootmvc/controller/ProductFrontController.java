package com.cg.spring.springbootmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.spring.springbootmvc.beans.Product;

@RestController
public class ProductFrontController {

	
	@RequestMapping("/products")
	
	public Product getProduct(@RequestParam String id) {
	
	RestTemplate rt=new RestTemplate();
	Product p=rt.getForObject("http://localhost:9008/getproducts?id="+id, Product.class);
	return p;

}
}