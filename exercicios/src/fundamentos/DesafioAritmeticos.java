package fundamentos;

public class DesafioAritmeticos {

	public static void main(String[] args) {

		 double num1, den1, num2, den2 = 2, superior1, superior2, superior, inferior, resultado;
		 
		 
		 num1 = Math.pow(6 * (3 + 2), 2);
		 den1 = 3 * 2;
		 
		 num2 = (1 - 5) * (2 - 7);
		 
		 superior1 = num1 / den1;
		 superior2 = Math.pow(num2 / den2, 2) ;
		 
		 superior = Math.pow(superior1 - superior2, 3);
		 inferior = Math.pow(10, 3);
		 
		 resultado = superior / inferior;
		 
		 System.out.println(resultado);
		 
		 
//		 int primeiro;
//		 int segundo;
//		 int terceiro;
//		 int quarto = (int)Math.pow(10, 3);
//		 int resultado;
//		 
//		 primeiro = a * b;
//		 primeiro = (int)Math.pow(primeiro, 2);
//		 primeiro = primeiro / (3 * 2);
//		 
//		 segundo = (d * e) / 2;
//		 segundo = (int)Math.pow(segundo, 2);
//		
//		 terceiro = primeiro - segundo;
//		 
//		 terceiro =  (int)Math.pow(terceiro, 3);
//		 resultado = terceiro / quarto;
//		 
//		 System.out.println(primeiro);
//		 System.out.println(segundo);
//		 System.out.println(terceiro);
//		 System.out.println(quarto);
//		 System.out.println(resultado);

	}

}
