package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {

//		Predicate<Produto> iscaro = prod -> (prod.preco  * (1 - prod.desconto))>= 600.00;
//		Produto produto = new Produto("Mesa", 700.00, 0.05);
//		System.out.println(iscaro.test(produto));
		
		
		//Metodo consumer
		
		Consumer<Produto> imprimir = prod -> System.out.println(prod.nome);
		
		Produto produto = new Produto("Caneta", 10.00, 0.1);
		
		imprimir.accept(produto);
		
		Produto produto1 = new Produto("Lapis", 12.24, 0.05);
		Produto produto2 = new Produto("Borracha", 6.50, 0.25);
		Produto produto3 = new Produto("Tesoura", 8.98, 0.15);
		Produto produto4 = new Produto("Apotador", 4.99, 0.12);
		
		List<Produto> listaMaterial = Arrays.asList(produto1, produto2, produto3, produto4);

		listaMaterial.forEach(imprimir);
		System.out.println();
		listaMaterial.forEach(p -> System.out.println(p.preco));
		System.out.println();
		listaMaterial.forEach(System.out::println);
	
	}

}
