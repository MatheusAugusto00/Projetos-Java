package Teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
	public static void main(String[] args) {
		
		Carro c1 = new Carro(300);
		Ferrari c2 = new Ferrari();
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		//c2.ligarTurbo();
		c2.ligarAr();
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);

		
		
		c1.frear();
		
		
	}
}
