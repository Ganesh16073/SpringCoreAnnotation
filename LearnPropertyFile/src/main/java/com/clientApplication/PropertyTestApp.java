package com.clientApplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.sbeans.PersonInfo;

public class PropertyTestApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext cxt=new AnnotationConfigApplicationContext(AppConfig.class);
		PersonInfo inf=cxt.getBean("personInfo",PersonInfo.class);
		System.out.println(inf);
	}
}
