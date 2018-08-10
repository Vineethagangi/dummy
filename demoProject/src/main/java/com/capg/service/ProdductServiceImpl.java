package com.capg.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.bean.Product;
import com.capg.repo.ProductRepo;

@Service
public class ProdductServiceImpl implements ProductService{

	@Autowired
	private ProductRepo repo;
	
	@Override
	public Optional<Product>getProductById(int id){
		return repo.findById(id);
	}
	
}
