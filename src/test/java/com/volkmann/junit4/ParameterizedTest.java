package com.volkmann.junit4;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/*
Melhor alternativa para usar testes parametrizados:
 
<dependency>
<groupId>pl.pragmatists</groupId>
<artifactId>JUnitParams</artifactId>
<version>1.0.5</version>
<scope>test</scope>
</dependency>
*/

@RunWith(Parameterized.class)
public class ParameterizedTest {

	private final int first;
	private final int second;
	private final int expectedSum;

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { //
				{ 0, 0, 0 }, //
				{ 1, 1, 2 }, //
				{ 2, 2, 3 } // should fail
		});
	}

	public ParameterizedTest(int first, int second, int expectedSum) {
		this.first = first;
		this.second = second;
		this.expectedSum = expectedSum;
	}

	@Test
	public void testarSoma() {
		assertEquals(sum(first, second), expectedSum);
	}

	public int sum(int first, int second) {
		return first + second;
	}

}
