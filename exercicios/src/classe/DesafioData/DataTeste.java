package classe.DesafioData;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data1 = new Data(10, 10, 1990);
		Data data2 = new Data();
		
		System.out.println(data1.dataFormatada());
		System.out.println(data2.dataFormatada());

	
	}
}
