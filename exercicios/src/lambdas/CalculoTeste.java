package lambdas;

public class CalculoTeste {

	public static void main(String[] args) {

		Calculo calculo = new Soma();
		System.out.println(calculo.executar(6, 6));
		
		calculo = new Multiplicar();
		System.out.println(calculo.executar(6, 6));

	}

}
