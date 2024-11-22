package com.bmodel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Product {
	private String productName;
	private double price;
	private String category;
	
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getCategory() {
		return category;
	}
	
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + ", category=" + category + "]";
	}
	
	

}
