package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList
				("Asael", "Jonatas", "Adna", "Acsa", "Natanael", "Sara");
		
		
		System.out.println("Imprimir lista usando For");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i)); 
		}
		
		System.out.println("\nImprimir lista usando Foreach");
		
		for (String listaAprovados : aprovados) {
			System.out.println(listaAprovados);
		}
		
		System.out.println("\nImprimir lista usando Iterator");
		Iterator<String> iterator = aprovados.iterator(); 
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nImprimir lista usando Stream");
		
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
		
		
		
		
		
	}

}
