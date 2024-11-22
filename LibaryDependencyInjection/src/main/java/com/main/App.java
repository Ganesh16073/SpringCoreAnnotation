package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bData.Book;
import com.config.AppConfig;

public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);	
		Book b=ctx.getBean("book",Book.class);
		System.out.println(b);
		ctx.close();
	}
}
