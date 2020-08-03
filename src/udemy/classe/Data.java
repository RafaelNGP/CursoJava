package udemy.classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada() {
		return dia + "/" + mes + "/" + ano;
	}
	String obterDataFormatadaCurso() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
