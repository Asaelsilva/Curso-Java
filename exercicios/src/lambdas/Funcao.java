package lambdas;

import java.util.function.Function;

public class Funcao {

		public static void main(String[] args) {
			
			Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
			
			Function<String, String> oResultadoE = valor -> "O resultado � " + valor;
			
			Function<String, String> esclamacao = valor -> valor + "!!!";
			
			Function<String, String> Interrogacao = valor -> valor + "???";

			String resultFinal = parOuImpar
					.andThen(oResultadoE)
					.andThen(esclamacao)
					.apply(5);
			
			String resultFinal2 = parOuImpar
					.andThen(oResultadoE)
					.andThen(Interrogacao)
					.apply(10);
			
			System.out.println(parOuImpar.apply(53));
			System.out.println(resultFinal);
			System.out.println(resultFinal2);
		}
}
