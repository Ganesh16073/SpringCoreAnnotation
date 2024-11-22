package com.beans;

import org.springframework.stereotype.Component;

@Component
public class BlueDart implements Courier{

	@Override
	public String deliver(int oid) {
		
		return "\nOID => "+oid+" :: Ordered item are kept for Delivery by bDart";
	}

}
