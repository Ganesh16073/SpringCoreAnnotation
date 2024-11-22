package com.sbeans;

import org.springframework.stereotype.Component;

@Component
public final class DesielEngine implements IEngine{

	@Override
	public void startEngine() {
		System.out.println("DesielEngine=> Desiel Engine Started");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("DesielEngine=> Desiel Engine Stoped");
		
	}

}
