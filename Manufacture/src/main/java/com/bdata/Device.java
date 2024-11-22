package com.bdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Device {

	@Autowired
	Manufacturer manf;
	@Value("Nokia")
	private String deviceName;
	
	public Device()
	{
		System.out.println("Default Constructor of Device");
	}

	public Device(String deviceName) {
		System.out.println("Parameter Constructor of Device");
		this.deviceName = deviceName;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public Manufacturer getManf() {
		return manf;
	}

	public void setManf(Manufacturer manf) {
		this.manf = manf;
	}

	@Override
	public String toString() {
		return "Device [manf=" + manf + ", deviceName=" + deviceName + "]";
	}
	
	
	
}
