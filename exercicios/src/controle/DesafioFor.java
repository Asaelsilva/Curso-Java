package controle;

public class DesafioFor {

	public static void main(String[] args) {

		String valor ="#";
		
//		for (int i = 0; i <= 5; i++) {
//			System.out.println(valor);
//			valor += "#";
//		}

		String resultado = "#####";
		for (; !valor.equals(resultado); ) {
			System.out.println(valor);
			valor+= "#";
		}
		
		//Outra forma 
		System.out.println();
		for (String i = "#"; !i.equals("#####") ; i+="#") {
			System.out.println(i);
		}
		
	}

}
