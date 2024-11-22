package com.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vehical {
	@Autowired
	@Qualifier("desielEngine")
	IEngine vehical;
	
	public String journy(String start,String end)
	{
		System.out.println("Journy Start from =>>"+start);
		vehical.startEngine();
		System.out.println("Journy Ends in =>>"+end);
		vehical.stopEngine();
		return "Journy Completed";
	}

}
