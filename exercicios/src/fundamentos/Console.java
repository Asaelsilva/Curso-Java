package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {

		System.out.print("Bom ");
		System.out.print("dia! \n");

		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %d %d \n", 1, 2 , 3, 4, 5, 6, 7, 8);
		
		System.out.printf("Salario: %.2f  \n", 12350.00);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		//nextLine() pega string
		String nome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		//nextInt() pega numeros inteiros
		int idade = entrada.nextInt();
		
		System.out.println("\n\nO nome digitado foi " + nome);
		System.out.println("asael j.silvaA idade digitada foi " + idade + "\n\n");
		
		System.out.printf("%s tem %d anos!", nome, idade);
		
		// Fecha scanner
		entrada.close();

	}

}
