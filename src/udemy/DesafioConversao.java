package udemy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println("Qual o primeiro salario?");
			BigDecimal valor1 = new BigDecimal(entrada.next().replace(",", "."));	
			System.out.println("Qual o segundo salario?");
			BigDecimal valor2 = new BigDecimal(entrada.next().replace(",", "."));	
			System.out.println("Qual o terceiro salario?");
			BigDecimal valor3 = new BigDecimal(entrada.next().replace(",", "."));	
			BigDecimal media = new BigDecimal("3");
			
			BigDecimal resultado = valor1.add(valor2).add(valor3).divide(media, RoundingMode.UP);
			System.out.println("Media dos ultimos 3 meses: " + resultado.toString());
		} catch (Exception inputException) {
			System.out.println("Valor invalido, abortando operacao.");
		} finally {
			entrada.close();
		}
	}	
}