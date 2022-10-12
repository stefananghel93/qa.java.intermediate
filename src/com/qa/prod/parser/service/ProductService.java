package com.qa.prod.parser.service;

import java.util.List;

import com.qa.prod.parser.bean.Product;

import co.qa.prod.parser.repository.ProductRepository;



public class ProductService {
	
  ProductRepository prodRepository;
  
  public ProductService() {
	  this.prodRepository = new ProductRepository();
  }
  
  public  List<Product> getProdDetails(){
	  return this.prodRepository.getProducts();
	  
  }
}


