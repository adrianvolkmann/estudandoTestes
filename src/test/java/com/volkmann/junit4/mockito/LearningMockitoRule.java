package com.volkmann.junit4.mockito;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.volkmann.ExecutaHello;

public class LearningMockitoRule {

	@Mock
	ExecutaHello executaHello;

	@Rule // must be public
	public MockitoRule rule = MockitoJUnit.rule();
	
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
