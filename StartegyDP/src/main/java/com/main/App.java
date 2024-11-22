package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.sbeans.Vehical;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext cxt=new AnnotationConfigApplicationContext(AppConfig.class);

		Vehical vh=cxt.getBean("vehical",Vehical.class);
		String st=vh.journy("Pune", "Banglore");
		System.out.println(st);
	}
	
}
