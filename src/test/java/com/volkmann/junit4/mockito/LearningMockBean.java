package com.volkmann.junit4.mockito;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.volkmann.ExecutaHello;
import com.volkmann.Hello;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class LearningMockBean {
	
	@Autowired
	ExecutaHello executaHello;

	//não precisa fazer o init
	@MockBean
	Hello hello;

	@Test
	public void testHello() {
//		Mockito.when(executaHello.executarHello("Volk")).thenReturn("Hellow Volk!");
		Mockito.when(hello.sayHello("Volk")).thenReturn("Hellow Volk!");
		
		String actual = executaHello.executarHello("Volk");

		Assert.assertEquals("Hellow Volk!", actual);
	}
	
	
	@Test
	public void shouldSuccess() {
		//esta injetando o mock 
		
		String actual = executaHello.executarHello("Volk");

		Assert.assertEquals("Hellow Volk!", actual);
	}
	
}
