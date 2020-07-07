package udemy;
import java.util.Scanner;

public class CalcularTemperatura {
	public static void main(String[] args) {//		Formula: (F-32) x 5/9 = C
		try {
			Scanner c = new Scanner(System.in);
			System.out.println("Insira o valor de conversao: ");
			double fahrenheit = c.nextDouble();
			System.out.println("Valor Informado: " + fahrenheit);

			final double ajuste = 32;
			final double fator = 5/9.0;
			System.out.println("Valor ajuste: " + ajuste + ".  Valor Fator: " + fator);
				
			double celsius = ((fahrenheit-ajuste) * fator);
			System.out.println("O valor em C eh: " + celsius);
			c.close();
		}catch (Exception inpuException) {
			System.out.println("valor incorreto.");
		}  
	}
}
