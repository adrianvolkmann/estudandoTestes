package com.volkmann.junit5;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class LearningAnnotationTest5 {

	@BeforeAll
	public static void antesClasse() {
		// deve ser static
		// run once during the start of the class
		System.out.println("Iniciou classe");
	}

	@BeforeEach
	public void antes() {
		// run it before each testcase runs.
		System.out.println("Antes testes");
	}

	@AfterEach
	public void depois() {
		// run it after the execution of each test case.
		System.out.println("Depois testes");
	}

	@AfterAll
	public static void depoisClasse() {
		// deve ser static
		// run once at the end of the class
		System.out.println("Terminou classe");
	}

	@Test
	public void shouldFail() {
		System.out.println("Teste1");
		assertEquals(0, 1);
	}

	@Test
	public void shouldSuccess() {
		System.out.println("Teste2");
		assertEquals(1, 1);
	}
	
	@Disabled //mostra skiped
	@Test
	public void shouldIgnored() {
		System.out.println("Teste3");
		assertEquals(1, 1);
	}

}
