package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	String nome;

	List<Item> itens = new ArrayList<Item>();

	public Compra(String nome) {
		this.nome = nome;
	}

	void adicionarItem(String nome, int qtd, double preco) {
		this.adicionarItem(new Item(nome, qtd, preco));
	}
	
	void adicionarItem(Item item) {
		this.itens.add(item);
		item.compra = this;
		
	}

	double getTotal() {
		double total = 0;

		for (Item item : itens) {
			total += item.qtd * item.preco;
		}
		return total;
	}

	void obterItem() {
		int contador = 1;
		for (Item item : itens) {
			System.out.println(contador + "� " + item.nome);
			contador++;
		}
	}
}
