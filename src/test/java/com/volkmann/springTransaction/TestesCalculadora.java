package com.volkmann.springTransaction;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.volkmann.calculadora.Calculadora;
import com.volkmann.calculadora.Sub;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class TestesCalculadora {

//	@Autowired
//	Soma soma;
//	
	@MockBean
	Sub sub;
	
	@Autowired
//	@InjectMocks
	Calculadora calculadora;
	
	@Test
	public void testeCalculo1() {
		
		int calculo1 = calculadora.calculo1(10, 50);
		
		System.out.println(calculo1);
		
		assertThat(calculo1)
		  .isEqualTo(60);
	}
	
}
