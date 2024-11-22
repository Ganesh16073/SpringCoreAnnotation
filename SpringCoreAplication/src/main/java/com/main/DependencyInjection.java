package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.WishMessageGenerator;
import com.config.AppConfig;

public class DependencyInjection {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		WishMessageGenerator wmg = ctx.getBean("wmg", WishMessageGenerator.class);
		String message = wmg.generateWishMessage("John");
        System.out.println(message);

        ctx.close();
	}
}

