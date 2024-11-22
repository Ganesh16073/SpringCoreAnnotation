package com.beans;

import org.springframework.stereotype.Component;

@Component
public final class DTDC implements Courier{

	@Override
	public String deliver(int oid) {
		return "Order id =>> "+oid+" By DTDC delivery";
	}

}
