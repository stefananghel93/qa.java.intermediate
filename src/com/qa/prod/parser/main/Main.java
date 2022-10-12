package com.qa.prod.parser.main;

import com.qa.prod.parser.service.ProductService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductService prodDetails = new ProductService();
		prodDetails.getProdDetails();
		System.out.println(prodDetails.getProdDetails());
		}
	}


