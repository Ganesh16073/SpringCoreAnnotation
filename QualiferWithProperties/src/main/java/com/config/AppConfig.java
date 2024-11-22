package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("com/config/applicationContext.xml")
@ComponentScan(basePackages = "com.beans")
public class AppConfig {

}
