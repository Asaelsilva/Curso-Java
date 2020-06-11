package controle;

public class WhileDeterminador {

	public static void main(String[] args) {
		
		int contador = 0;		
		String letra = "A";
		
		while (contador < 4) {
			System.out.println(letra);
			letra = letra + " + A";			
			contador++;			
		}
	}

}
