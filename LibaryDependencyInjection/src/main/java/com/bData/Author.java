package com.bData;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Author {

	@Value("GAnesh")
	private String name;
	@Value("India")
	private String country;
	
	public Author()
	{
		System.out.println("Author.Author()");
	}
	
	public Author(String name, String country) {
		this.name = name;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", country=" + country + "]";
	}
	
	
}
