package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2)/2;
		System.out.println(media.apply(10.0, 10.0));
		
		BiFunction<Double, Double, String> 
		resultado = (n1, n2) -> ((n1 + n2)/2) >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado.apply(7.8, 5.5));

		
		BiFunction<Double, Double, String> outraOpcao = (n1, n2) -> {
			double rest = (n1 + n2) / 2;
			return rest >= 7 ? "Aprovado" : "Reprovado";
		};
		System.out.println(outraOpcao.apply(7.8, 8.5));
		
		
		Function<Double, String> conceito = average -> average >= 7 ? "Aprovado" : "Reprovado" ;
		System.out.println(media.andThen(conceito).apply(8.8, 2.1) );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
