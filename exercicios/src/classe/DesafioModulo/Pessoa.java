package classe.DesafioModulo;

public class Pessoa {

	String nome;
	double peso;
	
	public Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Peso: " + this.peso);
	}
	
	double comer(Comida comida){
		
		this.peso += comida.peso;
		
		return this.peso;
	}

	
}
