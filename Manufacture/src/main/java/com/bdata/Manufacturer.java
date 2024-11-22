package com.bdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Manufacturer {

	@Value("MobilePhone")
	private String name;
	@Value("India")
	private String country;
	
	 
	public Manufacturer(String name, String country) {
		System.out.println("Parameter Constructor of Manufacturer");
		this.name = name;
		this.country = country;
	}
	
	 public Manufacturer() {
		System.out.println("Default Constructor of Manufacturer");
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
		return "Manufacturer [name=" + name + ", country=" + country + ", getName()=" + getName() + ", getCountry()="
				+ getCountry() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	 
	 
	 
}
