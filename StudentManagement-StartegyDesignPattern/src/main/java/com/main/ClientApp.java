package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.sbeans.Student;

public class ClientApp {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext cxt=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student std=cxt.getBean("student",Student.class);
		std.getMaterial();
		cxt.close();
	}

}
