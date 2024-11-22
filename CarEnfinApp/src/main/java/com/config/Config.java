package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.beans.Car;
import com.beans.Engine;

@Configuration
@ComponentScan(basePackages = "com.beans")
public class Config {
	
	@Bean(name="c")
	public Car getCar()
	{
		return new Car();
	}
	
	@Bean(name="e")
	public Engine getEngine()
	{
		return new Engine();
	}

}
