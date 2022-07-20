package com.volkmann.junit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.volkmann.ExecutaHello;

import org.junit.Assert;

@SpringBootTest // se nao informar ocorre o erro No qualifying bean
@RunWith(SpringJUnit4ClassRunner.class) // nao informar nao sobe o spring
public class LearningSpringJunit4 {

	@Autowired
	ExecutaHello executaHello;

	@Test
	public void testHello() {
		String actual = executaHello.executarHello("Volk");

		Assert.assertEquals("Hellow Volk!", actual);
	}

}
