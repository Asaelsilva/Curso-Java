package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {

		Carro c1 = new Carro();

		
		System.out.println("O carro esta ligado? " + c1.estaLigado());

		c1.ligar();
		//System.out.println("O carro esta ligado? " + c1.estaLigado());
		System.out.println("A porta do carro esta fechada? " + c1.portaFechada);
		
		c1.portaCarro("FECHAR");
		System.out.println("A porta do carro esta fechada? " + c1.portaFechada);
		
		c1.ligar();
		System.out.println("O carro esta ligado? " + c1.estaLigado());
		
		System.out.println("Giro do motor: " + c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();

		System.out.println("Giro do motor: " + c1.motor.giros());
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		System.out.println("Giro do motor: " + c1.motor.giros());
		
		c1.desligar();
		System.out.println(c1.estaLigado());
		
		
		
	}

}
