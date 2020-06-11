package oo.composicao.PrimeiroDesafio;


  
public class Sistema {

	public static void main(String[] args) {

		Cliente cliente  = new Cliente("Asael Silva");
		
		Compra compra = new Compra();
		
		compra.adicionarItem("Caneta", 4.50, 2);
		compra.adicionarItem(new Produto("Lapis", 2.50), 2);
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Borracha", 0.50, 3);
		compra1.adicionarItem(new Produto("Apontador", 0.35), 2);
		
		cliente.adicionarCompra(compra);
		cliente.adicionarCompra(compra1);
		
		System.out.println(cliente.obterValorTotalDaCompra());
		System.out.println(compra.obterValorTotal());
		System.out.println(compra1.obterValorTotal());
		
		
	
	}

}
