package com.sbeans;

import org.springframework.stereotype.Component;

@Component
public final class PetroleEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("PetroleEngine=> Petrole Engine Started");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("PetroleEngine=> Petrole Engine Stoped");
		
	}

}
