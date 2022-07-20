package com.volkmann;

import org.springframework.stereotype.Service;

@Service
public class Hello {

	public String sayHello(String name) {
		return String.format("Hellow %s!",name); 
	}
	
}
