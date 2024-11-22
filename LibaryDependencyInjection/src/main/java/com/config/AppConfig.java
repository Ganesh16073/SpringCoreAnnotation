package com.config;


import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bData.Author;
import com.bData.Book;

@Configuration
@ComponentScan(basePackages = "com.bData" )
public class AppConfig {

//	@Bean
//	public Author author()
//	{
//		return new Author();
//	}
//	@Bean
//	public Book book()
//	{
//		return new Book(author());
//	}
//	

}
