package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.beans.Flipkart;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext cxt=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Flipkart fk=cxt.getBean("flipkart",Flipkart.class);
		
		String message=fk.Shooping(new String[] {"Shirt", "Cargo Pant"}, new double[] {650,700});
	
		System.out.println(message);
		cxt.close();
	}
}
