package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bdata.Device;
import com.config.AppConfig;

public class ManufactureApp {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Device d=ctx.getBean(Device.class);
		System.out.println(d);
	}

}
