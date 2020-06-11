package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {

	
		Compra compra = new Compra("Asael");
		
		System.out.println("Cliente: " + compra.nome);
		
		compra.adicionarItem(new Item("Leite", 3, 2.50));
		compra.adicionarItem("Cafe", 2, 8.55);
		compra.itens.add(new Item("100g Mussarela", 1, 7.90));
		
		
		System.out.println("\nLista de produtos");
		compra.obterItem();
		
		System.out.println("\nItems");
		System.out.println(compra.itens.size() + " items no carrinho");
		
		System.out.println("\nTotal da compra");
		System.out.printf("R$ %.2f", compra.getTotal());
		
	}

}
