package com.capg.service;

import java.util.Optional;

import com.capg.bean.Product;

public interface ProductService {

public	Optional<Product> getProductById(int id);

}
