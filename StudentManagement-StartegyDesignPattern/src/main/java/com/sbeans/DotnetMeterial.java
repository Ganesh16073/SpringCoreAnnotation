package com.sbeans;

import org.springframework.stereotype.Component;

@Component
public final class DotnetMeterial implements ICourseMaterial {

	@Override
	public void courseMaterial() {
		System.out.println("You Opened DotNet Course Material");
		
	}

}
