package com.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bmodel.Customer;
import com.bmodel.Order;
import com.bmodel.Product;
import com.config.ApppConfig;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext cont=new AnnotationConfigApplicationContext(ApppConfig.class);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println();
		System.out.println("============================== Enter Customer Detail ==============================");
		System.out.println();
		Customer cm=cont.getBean(Customer.class); // object from ioc
		
		System.out.println("Enter the Costumer Name");
		String customerName=sc.nextLine();
		cm.setCustomerName(customerName);
		System.out.println("Enter the Costumer Email");
		String customerEmail=sc.nextLine();
		cm.setCustomerEmail(customerEmail);
		
		System.out.println();
		System.out.println("============================== Enter Product Detail ==============================");
		System.out.println();
		
		Product pd=cont.getBean(Product.class); // object from ioc
		
		System.out.println("Enter the Product Name");
		String productName =sc.nextLine();
		pd.setProductName(productName);
		
		System.out.println("Enter the Product Price");
		double price=sc.nextDouble();
		pd.setPrice(price);
		
		
		System.out.println("Enter the Product Catagory");
		sc.nextLine();
		String category=sc.nextLine();
		pd.setCategory(category);
		
		System.out.println();
		System.out.println("============================== Enter Order Detail ==============================");
		System.out.println();
		
		Order odr=cont.getBean(Order.class); // object by ioc
		
		System.out.println("Enter the Quantity");
		int quantity=sc.nextInt();
		odr.setQuantity(quantity);
		
		System.out.println("The Order Details are => ");
		
		System.out.println(odr); 
		cont.close();
	}
	
}
