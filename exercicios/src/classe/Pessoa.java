package classe;

public class Pessoa {

	String nome;
	double peso;

	public Pessoa(String nome, double peso) {
		
		this.nome = nome;
		this.peso = peso;
	}

	public double Comer(Comida comida) {

		if (comida != null) {
			
			this.peso += comida.peso;
		}
		

		return this.peso;
	}

	

}
