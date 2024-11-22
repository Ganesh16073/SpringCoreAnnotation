package com.bmodel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {
	
	private final String orderId;
	private  int quantity;
	

	private final Customer customer;
	private final Product product;
	
	@Autowired
	public Order(String orderId, Customer customer, Product product) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.product = product;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getOrderId() {
		return orderId;
	}

	public int getQuantity() {
		return quantity;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Product getProduct() {
		return product;
	}

	@Override
	public String toString() {
		return "Order \n [orderId=" + orderId + ",\n quantity=" + quantity + ",\n customer=" + customer + ",\n product="
				+ product + "]";
	}

	
	
	
	
	
	

}
