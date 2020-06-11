package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notbook", 1000);
		Produto p2 = new Produto();
		Produto.desconto = 0.50;

		p2.nome = "Caderno";
		p2.preco = 100.00;

		System.out.println("Produto: " + p1.nome);
		System.out.println("Pre�o: " + p1.preco);
		System.out.println("Desconto: " + Produto.desconto + "%");
		var precoFinal1 = p1.precoComDesconto();
		System.out.printf("Pre�o final: %.2f\n",precoFinal1);

		System.out.println("\n\n");

		
		System.out.println("Produto: " + p2.nome);
		System.out.println("Pre�o: " + p2.preco);
		System.out.println("Desconto: " + Produto.desconto + "%");
		var precoFinal2 = p2.precoComDesconto();		
		System.out.printf("Pre�o final: %.2f\n",precoFinal2);
		
		
		
		var carrinho = (precoFinal2 + precoFinal1) /2;
		
		System.out.println("\n\n");
		
		System.out.printf("Media de pre�o dos produtos em carrinho: %.2f", carrinho);

	}

}
