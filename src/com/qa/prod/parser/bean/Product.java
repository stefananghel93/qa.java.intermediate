package com.qa.prod.parser.bean;

import java.io.Serializable;

public class Product implements Serializable {

		
		
		private int id;
		private String name;
		private float price;
		private String category;
		private float rating;
		private float discountPercentage;
		private boolean isAvailable;
		public int getId() {
			return id;
		}
		public Product setId(int id) {
			this.id = id;
			return this;
		}
		public String getName() {
			return name;
		}
		public Product setName(String name) {
			this.name = name;
			return this;
		}
		public float getPrice() {
			return price;
		}
		public Product setPrice(float price) {
			this.price = price;
			return this;
		}
		public String getCategory() {
			return category;
		}
		public Product setCategory(String category) {
			this.category = category;
			return this;
		}
		public float getRating() {
			return rating;
		}
		public Product setRating(float rating) {
			this.rating = rating;
			return this;
		}
		public float getDiscountPercentage() {
			return discountPercentage;
		}
		public Product setDiscountPercentage(float discountPercentage) {
			this.discountPercentage = discountPercentage;
			return this;
		}
		public boolean isAvailable() {
			return isAvailable;
		}
		public Product setAvailable(boolean isAvailable) {
			this.isAvailable = isAvailable;
			return this;
		}
		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + ", rating="
					+ rating + ", discountPercentage=" + discountPercentage + ", isAvailable=" + isAvailable + "]";
		}
	
		
		
		
}
