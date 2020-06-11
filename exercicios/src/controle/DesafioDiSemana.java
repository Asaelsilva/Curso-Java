package controle;

import java.util.Scanner;

public class DesafioDiSemana {

	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o nome do dia: ");
		
		String dia = entrada.next();
		
		if ("domingO".equals(dia.toLowerCase())) {
			System.out.println("1");
		}else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println("2");
		}else if (dia.equalsIgnoreCase("terça")) {
			System.out.println("3");
		}else if ("quarta".equalsIgnoreCase(dia)) {
			System.out.println("4");
		}else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		}else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println("6");
		}else if (dia.equalsIgnoreCase("sabado")) {
			System.out.println("7");
		}else {
			System.out.printf("%s não é um dia da semana.", dia);
		}
		
		
		entrada.close();
		
		

	}

}
