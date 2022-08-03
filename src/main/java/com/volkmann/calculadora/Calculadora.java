package com.volkmann.calculadora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class Calculadora {

	@Autowired
	Soma soma;

	@Autowired
	Sub sub;

	public int calculo1(int valSom, int valSub) {
		int add2 = soma.add2(valSom);

		int sub2 = sub.sub2(valSub);

		return add2 + sub2;
	}
	
	@Transactional
	public int calculo2(int valSom, int valSub) {
		int add2 = soma.add2(valSom);

		int sub2 = sub.sub2(valSub);

		return add2 + sub2;
	}
	
	

}
