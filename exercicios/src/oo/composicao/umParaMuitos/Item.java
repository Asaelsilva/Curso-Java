package oo.composicao.umParaMuitos;

public class Item {

	String nome;
	int qtd;
	double preco;
	
	Compra compra;

	public Item(String nome, int qtd, double preco) {

		this.nome = nome;
		this.qtd = qtd;
		this.preco = preco;
	}
}
