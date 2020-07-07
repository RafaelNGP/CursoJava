package udemy;
import java.util.Scanner;

public class CalcularTemperatura {
	public static void main(String[] args) {//		Formula: (F-32) x 5/9 = C
		final double ajuste = 32;
		final double fator = 5/9.0;
		Scanner c = new Scanner(System.in);
		System.out.println("Insira o valor de conversao: ");
		try {
			double fahrenheit = c.nextDouble();
			double celsius = ((fahrenheit-ajuste) * fator);
			System.out.println("Valor Informado: " + fahrenheit);
			System.out.println("Valor ajuste: " + ajuste + ".  Valor Fator: " + fator);
			System.out.println("O valor em C eh: " + celsius);				
		}catch (Exception inpuException) {
			System.out.println("valor incorreto.");
		}finally {
			c.close();
		}
	}
}