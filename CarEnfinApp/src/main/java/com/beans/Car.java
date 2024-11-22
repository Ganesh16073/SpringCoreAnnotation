package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired	
	Engine e;
	
	public void setEngine(Engine e)
	{
		this.e=e;
	}
	public void show()
	{
		System.out.println("Engin Name => "+e.getName()+"\tChesis Name => "+e.getChesis());
	}

}
