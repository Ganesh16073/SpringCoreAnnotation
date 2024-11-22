package com.beans;

import org.springframework.beans.factory.annotation.Value;

public class Engine {
	@Value("FIAT")
	private String name;
	@Value("CJ12GT")
	private String chesis;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChesis() {
		return chesis;
	}
	public void setChesis(String chesis) {
		this.chesis = chesis;
	}
	
	
	

}
