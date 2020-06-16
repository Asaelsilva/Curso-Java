package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		//.charAt(0) imprime a letra que está na posição do indice
		System.out.println("Ola Mundo!".charAt(0));
		
		String s = "Bom dia";
		//.toUpperCase() imprime toda a string em maiusculo
		s = s.toUpperCase();
		System.out.println(s);
		
		//.concat concatena
		System.out.println(s.concat("!!!"));
		System.out.println(s + " Galera");
		
		//.startsWith Testa se essa sequência começa com o prefixo especificado
		System.out.println(s.startsWith("Bom"));
		
		//.toLowerCase() Converte todos os caracteres nesta String em minúsculas
		System.out.println(s.toLowerCase().startsWith("bom"));
		
		//.length() pega o tamanho da string
		System.out.println(s.length());
		
		//.equals Compara essa sequência com o objeto especificado. 
		System.out.println(s.equals("bom dia"));
		
		//equalsIgnoreCase Compara essa String com outra String, ignorando as considerações de caso
		System.out.println("1°" + s.equalsIgnoreCase("bom dia"));
		
		
		var nome = "Asael";
		var sobreNome = "João da Silva";
		var idade = 27;
		var altura = 1.82;
		
		System.out.println("Nome: " + nome + " Sobre nome: " + sobreNome + " idade: " + idade + " Altura: " + altura + "\n\n");
		System.out.println("Nome: " + nome + " \nSobre nome: " + sobreNome + " \nIdade: " + idade + " \nAltura: " + altura + "\n\n");
		
		
		System.out.printf("O senhor %s %s, tem %d anos e %.2f de altura.",nome,  sobreNome, idade, altura);
		String frase = String.format("\nO senhor %s %s, tem %d anos e %.2f de altura.",nome,  sobreNome, idade, altura);
				
		System.out.println(frase);		
		
	}

}
