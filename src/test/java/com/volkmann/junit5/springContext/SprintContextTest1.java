package com.volkmann.junit5.springContext;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SprintContextTest1 {

	@Test
	void test1() throws InterruptedException {
		TimeUnit.SECONDS.sleep(5);
		System.out.println("EXECUTOU TESTE1");
	}

	
}
