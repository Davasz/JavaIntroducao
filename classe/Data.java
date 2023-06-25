package classe;

public class Data {
	
	String dia;
	String mes;
	String ano;
	
	
	Data(String dia, String mesRecebido, String anoRecebido) {
		this.dia = dia;
		mes = mesRecebido;
		ano = anoRecebido;
	}
	
	Data() {
		//dia = "01";
		//mes = "01";
		//ano = "1970";
		this("01", "01", "1970");
	}
	
	String dataFormatada() {
		
		//verificar e formatar
		
		if(!dia.startsWith("0") && dia.length() == 1) {
			dia = "0".concat(dia);
		} 
		if(!mes.startsWith("0") && mes.length() == 1) {
			mes = "0".concat(mes);
		}
		
		return String.format("Hoje e %s/%s/%s", dia, mes, ano);
	}
	
}

