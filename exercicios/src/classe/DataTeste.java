package classe;

public class DataTeste {

	public static void main(String[] args) {

		Data data2 = new Data();
		Data data1 = new Data(30,03,1993);

		
		System.out.println("Imprimindo data no metodo main");
		System.out.println(data1.obterDataFormatada());
		System.out.println(data2.obterDataFormatada());
		
		System.out.println("\n");
		System.out.println("Imprimindo data atravez do metodo dentro da classe data");
		data1.imprimirDataFormatada();
		data2.imprimirDataFormatada();
		
	}

}
