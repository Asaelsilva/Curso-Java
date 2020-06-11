package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner digite = new Scanner(System.in);
		
		System.out.print("Digite o primeiro salario: ");
		String salario1 = digite.next().replace(",", ".");
		
		System.out.print("Digite o segundo salario: ");
		String salario2 = digite.next().replace(",", ".");
		
		System.out.println("Digite o terceiro salario: ");
		String salario3 = digite.next().replace(",", ".");
		
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		
		double soma =  (valor1 + valor2 + valor3) /3;
		
		System.out.printf("A media salaria  e %.2f", soma );
		
		digite.close();
		
	}

}
