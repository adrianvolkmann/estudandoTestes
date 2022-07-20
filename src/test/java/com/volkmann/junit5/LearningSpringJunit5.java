package com.volkmann.junit5;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.volkmann.ExecutaHello;


@SpringBootTest 
//@RunWith(SpringJUnit4ClassRunner.class) //junit5 nao precisa dessa anotacao
public class LearningSpringJunit5 {

	@Autowired
	ExecutaHello executaHello;

	@Test
	public void testHello() {
		String actual = executaHello.executarHello("Volk");

		Assert.assertEquals("Hellow Volk!", actual);
	}
	
}
