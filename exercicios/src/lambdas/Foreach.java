package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("Forma tradicional Foreach...");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		
		System.out.println("\nUsando Lambda #1...");
		aprovados.forEach((nome) -> {System.out.println(nome + "!!!");});
//		aprovados.forEach(nome -> System.out.println(nome + "!!!"));


		System.out.println("\nMethod References...");
		aprovados.forEach(System.out::println);
		
		
		System.out.println("\nUsando Lambda #2...");
		aprovados.forEach((nome) -> meuImprimir(nome));
		
		System.out.println("\nMethod References #2...");
		aprovados.forEach(Foreach:: meuImprimir);
	}
	static void meuImprimir(String nome) {
		System.out.println("Oi, meu nome � " + nome);
	}

}
