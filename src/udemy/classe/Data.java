package udemy.classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data() {
//		Valores padroes, caso nao seja passado valores.
		this(1, 1, 1970);
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		return dia + "/" + mes + "/" + ano;
	}
	String obterDataFormatadaCurso() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
