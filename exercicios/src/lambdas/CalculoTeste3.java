package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		BinaryOperator<Double> soma = (x, y) -> { return x +  y;};

		System.out.println(soma.apply(6.0, 6.0));
		
		soma = (c, d) -> c * d;
		System.out.println(soma.apply(2.0, 5.0));
		
		
		
		System.out.println("\n\n");
		
		
		BinaryOperator<Integer> soma2 = (x, y) ->{ return x +  y;};

		System.out.println(soma2.apply(5, 5));
		
		soma2 = (c, d) -> c * d;
		System.out.println(soma2.apply(3, 5));
	}

}
