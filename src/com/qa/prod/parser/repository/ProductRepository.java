package com.qa.prod.parser.repository;
import java.util.List;

import com.qa.prod.parser.bean.Product;
import com.qa.prod.parser.util.CsvReader;

public class ProductRepository {
	
	List<Product> prodList;
	
	public ProductRepository() {
		 CsvReader csvReader = new CsvReader();
		 prodList = csvReader.readProdCSVFile();
	}	 
		 
    public List<Product> getProducts(){
		 return this.prodList;
	}

    
}
