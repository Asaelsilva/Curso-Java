package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	
	public Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
		
	}
	
	public Data(int dia, int mes, int ano) {
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;

	}
	

//	public String obterDataFormatada1() {
//
//		String d = Integer.toString(dia);
//		String m = Integer.toString(mes);
//		String a = Integer.toString(ano);
//		String data1 = "Data " + d + "/" + m + "/" + a;
//
//		return data1;
//	}

	public String obterDataFormatada() {
		
		String formato = "Data %d/%d/%d";

		return String.format(formato, dia, mes, ano);
	}

	public void imprimirDataFormatada() {

		System.out.println(obterDataFormatada());
	}
}
