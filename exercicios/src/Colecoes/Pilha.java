package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno principe");
		livros.push("Dom Quixote");
		livros.push("O hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println("Removendo o livro " + livros.pop());
		System.out.println("Removendo o livro " + livros.poll());
		System.out.println("Removendo o livro " + livros.poll());
		System.out.println("Removendo o livro " + livros.poll());
		System.out.println("Removendo o livro " + livros.remove()); //retorna exce��o
		//System.out.println("Removendo o livro " + livros.pop()); retorna exce��o
	}

}
