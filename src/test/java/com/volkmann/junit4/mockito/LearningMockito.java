package com.volkmann.junit4.mockito;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
//import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.volkmann.ExecutaHello;


//@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class LearningMockito {

	@Mock
	ExecutaHello executaHello;

	@Before
	public void initMocks() {
		//caso seja usado o runner, este metodo não é necessario
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void initializeLocal() {
		ExecutaHello localHello = Mockito.mock(ExecutaHello.class);
		Mockito.when(localHello.executarHello("Volk")).thenReturn("Hellow Volk!");
		
		String actual = localHello.executarHello("Volk");

		Assert.assertEquals("Hellow Volk!", actual);
	}

	@Test
	public void shouldSuccess() {
		Mockito.when(executaHello.executarHello("Volk")).thenReturn("Hellow Volk!");

		String actual = executaHello.executarHello("Volk");

		Assert.assertEquals("Hellow Volk!", actual);
	}

	@Test
	public void shouldFail() {
		Mockito.when(executaHello.executarHello("Volk")).thenReturn("Hellowa Volk!");

		String actual = executaHello.executarHello("Volk");

		Assert.assertEquals("Hellow Volk!", actual);
	}
}
