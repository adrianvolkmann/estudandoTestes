package com.volkmann.junit4;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
//import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;
//import org.junit.runners.MethodSorters;

//permite definir ordem de execucao
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LearningAnnotationTest {

	@BeforeClass
	public static void antesClasse() {
		// deve ser static
		// run once during the start of the class
		System.out.println("Iniciou classe");
	}

	@Before
	public void antes() {
		// run it before each testcase runs.
		System.out.println("Antes testes");
	}

	@After
	public void depois() {
		// run it after the execution of each test case.
		System.out.println("Depois testes");
	}

	@AfterClass
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
	
	@Ignore //mostra como skipped
	@Test
	public void shouldIgnored() {
		System.out.println("Teste3");
		assertEquals(1, 1);
	}

}
