package udemy;

public class TiposPrimitivos {
	public static void main(String[] args) {
//		informacoes de um funcionario
		
//		tipos numericos
		byte anosDeEmpresa = 23;
		short numerosDeVoo = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; //TEM QUE TER O L NO FINAL
		
//		tipos numericos reais
		float salario = 11_445.44F; //TEM QUE TER O F NO FINAL
		double vendasAcumuladas = 2_991_797_103.01;
		
//		Tipo booleano
		boolean estaDeFerias = false;
		boolean trabalhandoHomeOffice = true;
		
//		tipo char
		char status = 'A';
		char statusNumerico = '1';
		char statusCodigo = '\u0010';
		
//		dias de empresa
		System.out.println(anosDeEmpresa * 365);

//		Numero de viagens
		System.out.println(numerosDeVoo / 2);
		
//		pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
//		id
		System.out.println(id + ": ganha -> " + salario);
		
//		status
		System.out.println("Esta de ferias? " + estaDeFerias);
		System.out.println("Esta de Home Office? " + trabalhandoHomeOffice);
		
//		chars
		System.out.println(status);
		System.out.println(statusCodigo);
		System.out.println(statusNumerico);		
	}
}
