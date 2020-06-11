package oo.heranca.carroTeste;

import oo.heranca.DesafioCarro.Carro;
import oo.heranca.DesafioCarro.Civic;
import oo.heranca.DesafioCarro.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {

		Carro civic = new Civic();
		
		
		civic.acelerar();
		System.out.println("Civic => " + civic);

		civic.acelerar();
		System.out.println("Civic => " + civic);

		civic.acelerar();
		System.out.println("Civic => " + civic);
		
		
		Ferrari ferrari = new Ferrari(400);
		
		System.out.println("ferrari => " + ferrari);
		
		ferrari.acelerar();
		System.out.println("ferrari => " + ferrari);
		
		ferrari.acelerar();
		System.out.println("ferrari => " + ferrari);
		ferrari.frear();
		
		ferrari.ligarTurbo();
		ferrari.ligarAr();
		
		ferrari.acelerar();
		System.out.println("ferrari => " + ferrari);

	}

}
