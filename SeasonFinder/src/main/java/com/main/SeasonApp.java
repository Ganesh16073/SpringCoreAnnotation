package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.sbeans.Seasons;

public class SeasonApp {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext cxt=new  AnnotationConfigApplicationContext(AppConfig.class);
		
		Seasons sn = cxt.getBean("seasons", Seasons.class);
		String season = sn.generateSeason("Hii");
        System.out.println("Season for the current month: " + season);
	}

}
