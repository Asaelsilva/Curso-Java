package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		//Offer e Add -> Adicionam elementos na fila
		// diferen�a � op comportamento quando a fila esta cheia, add lan�a uma excessao ofeer retorna falso

		fila.offer("Bia");
		fila.offer("Marco");
		fila.offer("Lorrayne");
		fila.offer("Paulo");
		fila.offer("Luis");
		fila.offer("Bulma");
		
		// metodos para pegar elementos da fila: peek() e element()
		
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		

//		fila.size();
//		fila.clear();
//		fila.isEmpty(); // saber se a lista est� ou n�o vazia
		
		System.out.println("Removendo " + fila.remove() + " da fila");
		System.out.println("Removendo " + fila.poll() + " da fila");
		System.out.println("Removendo " + fila.poll() + " da fila");
		System.out.println("Removendo " + fila.poll() + " da fila");
		System.out.println("Removendo " + fila.poll() + " da fila");
		System.out.println("Removendo " + fila.poll() + " da fila");
		System.out.println("Removendo " + fila.poll() + " da fila"); // retorna null
		System.out.println("Removendo " + fila.remove() + "da fila"); // Lanca exce��o
		

	}

}
