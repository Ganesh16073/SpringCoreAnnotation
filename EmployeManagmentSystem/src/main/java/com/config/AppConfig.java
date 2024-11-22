package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.model", "com.repository", "com.service", "com.controler"})
public class AppConfig {

	
}
