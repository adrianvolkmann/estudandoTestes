package com.volkmann.junit5;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.volkmann.ExecutaHello;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class LearningMockito5 {

	@Mock
	ExecutaHello executaHello;

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
