package arrays;

import java.util.Scanner;

public class DesafioMedia {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double soma = 0;

		System.out.println("Quantas nota deseja informar? ");
		int qtd = entrada.nextInt();
		
		double[] notas = new double[qtd];
		
		
		System.out.println("Digite a nota..");
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("%d� Nota: ",  i + 1);
			notas[i] = entrada.nextDouble();
			soma += notas[i] /qtd;
		}
		
		
		System.out.println();
		System.out.println("As notas digitadas foram");
		
		for(double nota : notas) {
			System.out.println(nota	);
			//soma += nota /qtd;
		}
		
		System.out.printf("A media Final �: %.2f", soma);
		
		
		
		entrada.close();
		
	}

}
