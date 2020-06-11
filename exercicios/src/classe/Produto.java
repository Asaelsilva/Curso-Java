package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.30;
	

	public Produto() {
		
	}

	public Produto(String nomeInicial, double precoInicial) {

		nome = nomeInicial;
		preco = precoInicial;
	}

	
	public double precoComDesconto() {

		var desFinal = preco * (1 - desconto);

		return desFinal;
	}

}
