package classe;

public class Jantar {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Asael", 70.00);
		
		System.out.printf("Asael antes de comer tem %.2f kilos", p1.peso);
		
		Comida comida1 = new Comida("Arroz, feij�o e bife.", 0.500);
		Comida comida2 = new Comida("Lasanha", 0.200);
				
				
		p1.Comer(comida1);
		p1.Comer(comida2);
		
		System.out.println("\n");
		System.out.printf("Peso depois de comer e de %.3f", p1.peso);
		
		
		
		
	}

}
