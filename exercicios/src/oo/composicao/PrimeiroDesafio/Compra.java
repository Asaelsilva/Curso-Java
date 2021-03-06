package oo.composicao.PrimeiroDesafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	final List<Item> itens = new ArrayList<Item>();

	void adicionarItem(Produto produto, int qtd) {
		this.itens.add(new Item(produto, qtd));
	}

	void adicionarItem(String nome, double preco, int qtd) {
		this.itens.add(new Item(new Produto(nome, preco), qtd));
	}

	Double obterValorTotal() {
		double total = 0;

		for (Item item : itens) {
			total += item.qtd * item.produto.preco;
		}
		return total;
	}
}
