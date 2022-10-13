package com.qa.prod.parser.service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.qa.prod.parser.bean.Product;
import com.qa.prod.parser.repository.ProductRepository;



public class ProductService {
	
  ProductRepository prodRepository;
  
  public ProductService() {
	  this.prodRepository = new ProductRepository();
  }
  
  public  List<Product> getProdDetails(){
	  return this.prodRepository.getProducts();
	  
  }
  
  public List<Product> getProdListWithRating(){
	 List<Product> prodListWithRating = getProdDetails().stream().filter(prod ->prod.getPrice() > 1.5f && prod.getCategory().equals("Body Care")).collect(Collectors.toList());
	  return prodListWithRating;
	  
  }  
	  public Optional<Product> getProdWithHighestPrice(){
		  Optional<Product> prodwithHighestPrice = getProdDetails().stream().max(Comparator.comparingDouble(p -> p.getPrice()));
		return prodwithHighestPrice;
	}
}



