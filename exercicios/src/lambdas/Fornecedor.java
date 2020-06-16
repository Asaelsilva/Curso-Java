package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {

		Supplier<List<String>> umaLista = () -> Arrays.asList("Asael","Jonatas", "Sara", "Euclides");
		
		System.out.println(umaLista.get());
		
		
	}

}
