package com.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Flipkart {
	
	@Autowired
	@Qualifier("shipment")
	private Courier courier; // interface refrence
	
	public String Shooping(String item[],double price[])
	{
		double billAmount=0;
		for(double p:price)
		{
			billAmount+=p;
		}
		
		int oid=new Random().nextInt(1000); // creating random item
		String msg=courier.deliver(oid);
		
		return Arrays.toString(item)+" items with Billamount :: "+billAmount+" ---- "+msg;
	}

}
