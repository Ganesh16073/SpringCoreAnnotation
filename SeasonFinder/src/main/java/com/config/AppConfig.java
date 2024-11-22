package com.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sbeans.Seasons;

@Configuration
@ComponentScan(basePackages = "com.sbeans")
public class AppConfig {
	
	@Bean
	public LocalDate getLocatDate()
	{
		return LocalDate.now();
	}
	


}
