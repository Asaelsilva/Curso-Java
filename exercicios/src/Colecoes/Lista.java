package Colecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		

		ArrayList<Usuario> lista = new ArrayList<>();
		
		System.out.println("Lista de Particioantes");
		
		
		Usuario u1 = new Usuario("Beto");		
		lista.add(u1);

		
		lista.add(new Usuario("Asael"));
		lista.add(new Usuario("Janaina"));
		lista.add(new Usuario("Lais"));
		lista.add(new Usuario("Carolyne"));
		lista.add(new Usuario("Natanael"));
		
		var num = 1;
		for(Usuario usuario : lista) {
			System.out.println(num + "�" + usuario);
			num ++;
		}
		
		
		System.out.println("\n\nDigir qual indice do nome que deseja imprimir");
		var indice = entrada.nextInt();
		
		
		System.out.println(lista.get(indice - 1).nome);
		
		
		entrada.close();
		
		
		
	}

}
