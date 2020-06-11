package oo.composicao.PrimeiroDesafio;

public class Item {

	final int qtd;
	
	Produto produto;
	
	Item(Produto produto, int qtd){
		this.produto = produto;
		this.qtd = qtd;		
	}
}
