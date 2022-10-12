package com.qa.prod.parser.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.qa.prod.parser.bean.Product;


public class CsvReader {
	
	private static final String FILE_PATH = "/Users/stefananghel/Documents/product.csv";

	 public List<Product> readProdCSVFile() {
	      List<Product> prodList = new ArrayList<>(); 
		  
		  try
		  (BufferedReader br = new BufferedReader(new FileReader(new File(FILE_PATH)))) {
		 
		   
		  String prodData = br.readLine();
		  prodData = br.readLine(); 
		 
		  
		  while(prodData != null) {
			  String[] prodInfo = prodData.split(",");
			  int id = Integer.parseInt(prodInfo[0]);
	          String name = prodInfo[1];
	          float price = Float.parseFloat(prodInfo[2]);
	      	  String category = prodInfo[3];
	      	  float rating = Float.parseFloat(prodInfo[4]);
	      	  float discountPercentage = Float.parseFloat(prodInfo[5]);
	      	  boolean isAvailable = Boolean.parseBoolean(prodInfo[6]);
	      	  Product prod = new Product();
	      	  prod.setId(id).setName(name).setAvailable(isAvailable).setCategory(category).setDiscountPercentage(discountPercentage).setPrice(price).setRating(rating);
	      	  prodList.add(prod);
	      	 
	      	  prodData = br.readLine();
	          
		 }
		  
		 } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return prodList;
	  }
}
