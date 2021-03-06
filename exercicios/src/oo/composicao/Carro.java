package oo.composicao;

public class Carro {
	
	//Motor motor = new Motor();
	
	boolean portaFechada = false;	
	
	Motor motor;
	
	
	public Carro() {
		this.motor = new Motor(this);
	}
	
	
	
	void portaCarro(String condicao) {
		if (condicao.equalsIgnoreCase("fechar")) {
			portaFechada = true;
		} else if (condicao.equalsIgnoreCase("abrir")) {
			portaFechada = false;
		}
		
	}
	
	void acelerar() {
		if (portaFechada && motor.ligado) {
			
			if (motor.fatorInjecao < 2.5) {
				
				motor.fatorInjecao += 0.4;
			}
		}
	}
	
	void frear() {
		if (motor.fatorInjecao > 0.5) {
			
			motor.fatorInjecao -= 0.4;
		}
	}
	
	void ligar() {
		if (portaFechada) {
			motor.ligado = true;
		}
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
	
	
}
