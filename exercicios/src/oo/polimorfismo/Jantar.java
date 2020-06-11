package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {

		Pessoa convidado = new Pessoa(90.00);

		Arroz arroz = new Arroz(3.00);
		Feijao feijao = new Feijao(3.00);
		Sorvete sorvete = new Sorvete(4.10);
		
		Comida comida = new Sorvete(0.4);

		System.out.println("Peso inicial: " + convidado.getPeso());

		convidado.comer(arroz);
		convidado.comer(feijao);

		System.out.println("Comeu arroz e feijão: " + convidado.getPeso());
		convidado.comer(sorvete);
		convidado.comer(comida);
		
		System.out.println("Comeu arroz e feijão e sorvete: " + convidado.getPeso());

	}

}
