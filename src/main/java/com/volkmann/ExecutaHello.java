package com.volkmann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExecutaHello {

	@Autowired
	Hello hello;
	
	public String executarHello(String name) {
		return hello.sayHello(name);		
	}
	
}
