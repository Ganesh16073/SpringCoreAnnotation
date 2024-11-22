package com.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Seasons {
	
	@Autowired
	public LocalDate ld;
	
	public Seasons()
	{
		System.out.println("Seaons.Seaons()");
	}
	
	public String generateSeason(String user)
	{
		System.out.println("Seasons.generateSeason()");
		int month=ld.getMonthValue();
		if(month>=3 && month<=6)
		{
			return "Summer";
		}
		else if(month>=7 && month<=10)
		{
			return "Monsoon";
		}
		else
		{
			return "Winter";
		}
	}
	
	

}
