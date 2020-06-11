package controle;

import java.util.Scanner;

public class WhileDeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String palavra = "";
		
		System.out.println("Escreva o que quiser.");
		System.out.println("Ao escrever sair, o programa se encerrara!");
		System.out.println("Divirta-se!!!\n\n");
		while (!palavra.equalsIgnoreCase("sair")) {
			System.out.print("escreva uma palavra: ");
			palavra = entrada.nextLine();			
		}
		
		System.out.println("Você optou por sair do programa!");
		entrada.close();

	}

}
