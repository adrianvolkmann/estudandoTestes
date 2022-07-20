package com.volkmann.junit4;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Timed;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class LearningRunnersTest {

	@Test
	public void shouldFail() {
		assertEquals(0, 1);
	}

	@Test
	public void shouldSuccess() {
		assertEquals(1, 1);
	}

	@Test(timeout = 100)
	public void testTimeOut() throws InterruptedException {
		TimeUnit.SECONDS.sleep(150);
		assertEquals(1, 1);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void outOfBounds() {
		new ArrayList<Object>().get(1);
	}
	
	
	//para essa anotação fazer efeito, deve estar usando o SpringJUnit4ClassRunner
	//caso contrario não ira falhar o teste
	@Timed(millis=1000)
	@Test
	public void springTimed() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
		assertEquals(1, 1);
	}

}
