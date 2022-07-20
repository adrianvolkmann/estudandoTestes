package com.volkmann.junit4.mockito;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.volkmann.ExecutaHello;
import com.volkmann.Hello;


public class LearningInjectMock {

//    @Mock creates a mock implementation for the classes you need.
//    @InjectMock creates an instance of the class and injects the mocks that are marked with the annotations @Mock into it.

	@InjectMocks
	ExecutaHello executaHello;
	
	@Mock
	Hello hello;
	
	@Before
	public void initMocks() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void shouldSuccess() {
//		Mockito.when(executaHello.executarHello("Volk")).thenReturn("Hellow Volk!");
		Mockito.when(hello.sayHello("Volk")).thenReturn("Hellow Volk!");
		
		String actual = executaHello.executarHello("Volk");

		Assert.assertEquals("Hellow Volk!", actual);
	}
	
}
