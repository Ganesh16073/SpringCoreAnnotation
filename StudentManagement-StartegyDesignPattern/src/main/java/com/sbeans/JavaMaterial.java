package com.sbeans;

import org.springframework.stereotype.Component;

@Component
public final class JavaMaterial implements ICourseMaterial{

	@Override
	public void courseMaterial() {
		System.out.println("You Opened Java Course material Section");
		
	}
	

}
