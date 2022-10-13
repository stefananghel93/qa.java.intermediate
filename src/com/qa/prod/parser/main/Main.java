package com.qa.prod.parser.main;

import com.qa.prod.parser.service.ProductService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductService prod = new ProductService();
		
		System.out.println(prod.getProdWithHighestPrice());
		
		
		System.out.println(prod.getProdListWithRating());
		
		
		
		prod.getProdDetails();
		System.out.println(prod.getProdDetails());
		}
	
	
       
      
       
        
	
		
	}




