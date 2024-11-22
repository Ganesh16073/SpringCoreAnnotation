package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;

import com.bmodel.Customer;
import com.bmodel.Order;
import com.bmodel.Product;

@Configuration
@ComponentScan(basePackages = "com.bmodel")
public class ApppConfig {

    @Bean
    public Product product() {
        Product p = new Product();
        return p;
    }

    @Bean
    public Customer customer() {
    	return new Customer();
    }
    
    @Bean
    public Order order()
    {
    	Order od=new Order("DBE90", customer(),product() );
    	return od;
    }

   
}
