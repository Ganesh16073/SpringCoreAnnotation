package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.Car;
import com.config.Config;

public class CarApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class); // IOC Container
		Car cr=context.getBean("c",Car.class);
		cr.show();
		
	}

}
