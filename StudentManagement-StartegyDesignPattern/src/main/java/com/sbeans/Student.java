package com.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public final class Student {

	@Autowired
	@Qualifier("pythonMaterial")
	ICourseMaterial mat; 
	
	public void getMaterial()
	{
		mat.courseMaterial();
		System.out.println("All The Best");
	}
}
