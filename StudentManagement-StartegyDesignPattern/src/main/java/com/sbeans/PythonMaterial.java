package com.sbeans;

import org.springframework.stereotype.Component;

@Component
public final class PythonMaterial implements ICourseMaterial {

	@Override
	public void courseMaterial() {
		System.out.println("You opened Python Material");
		
	}

}
