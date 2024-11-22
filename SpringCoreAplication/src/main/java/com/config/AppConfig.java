package com.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.beans")
public class AppConfig {
    
    
    @Bean(name="currentTime")	
    public LocalTime createLTime() {
        return LocalTime.now();
    }

}
