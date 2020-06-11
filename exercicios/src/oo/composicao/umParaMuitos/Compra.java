package oo.composicao.umParaMuitos;

import java.util.ArrayList;

public class Compra {

	String cliente;
	
	ArrayList<Item> item = new ArrayList<Item>();
	
	void adicionarItem(String nome, int qtd, double preco) {
		this.adicionarItem(new Item(nome, qtd, preco));
	}
	
	void adicionarItem(Item item) {
		this.item.add(item);
		item.compra = this;
	}
	
	double obtervalorTotal() {
		
		double total = 0;
		
		for (Item itens : item) {
			
			total += itens.qtd * itens.preco;
		}
		
		return total;
	}
	
	
}
