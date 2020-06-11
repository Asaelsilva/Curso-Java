package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		
		double fahrenheit  = 86;
		final int sub = 32 ;
		final double div = 5/9.0;
		
		double celsius = (fahrenheit - sub) * div ;
		
		System.out.println(fahrenheit + " fahrenheit é igual a " + celsius + " celsius" );

	}

}
