package oo.composicao.umParaMuitos;

public class CompraTeste {

	public static void main(String[] args) {

		Compra compra1 = new Compra();
		
		compra1.cliente = "Asael Silva";
		compra1.item.add(new Item("Caneta", 10, 1.00));
		compra1.item.add(new Item("Caderno", 3, 10.02));
		compra1.adicionarItem("Lapis", 5, 0.50);
		compra1.adicionarItem(new Item("Borracha", 4, 0.25));
		
		System.out.println(compra1.item.size());
		System.out.println(compra1.obtervalorTotal());
 	}

}
