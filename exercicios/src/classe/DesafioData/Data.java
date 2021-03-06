package classe.DesafioData;

public class Data {

	int dia;
	int mes;
	int ano;

	boolean dataValida = false;

	Data(int dia, int mes, int ano) {

		if (dia < 32 && dia > 0 && mes > 0 && mes < 13 && ano < 2020) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;

			dataValida = true;
		}
	}
	public Data() {
		
		dia = 1;
		mes = 1;
		ano = 1970;
		
		dataValida = true;
	}

	String dataFormatada() {
		if (dataValida) {
			var forma = "Data %d/%d/%d";
			
			return String.format(forma, dia, mes, ano);
		}
		 return "Data Invalida";
	}

}
