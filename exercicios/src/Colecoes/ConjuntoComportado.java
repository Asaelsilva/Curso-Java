package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

//		Set<String> lista = new HashSet<String>(); // Lista n�o ordenada 
		SortedSet<String> lista = new TreeSet<String>(); // Lista ordenada
		
		//Dados homog�nio: dados do mesmo tipo.
		lista.add("Asael");
		lista.add("Jo�o");
		lista.add("Maria");
		lista.add("Natalia");
		lista.add("Bia");
		
		var i = 1;
		for (String candidatos : lista) {			 
			System.out.println(i + "� " + candidatos);
			i++;
		}
		
		System.out.println("\n\nLista de numeros...");
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(5);
		nums.add(8);
		nums.add(4);
		nums.add(7);
		nums.add(6);
		nums.add(2);
		nums.add(3);
		nums.add(3);
		
		for (Integer listNumerics : nums) {
			System.out.println(listNumerics);
		}
		
	}

}
