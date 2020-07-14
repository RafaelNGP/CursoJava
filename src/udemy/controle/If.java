package udemy.controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
//		Ao usar . no console, gera um inputexception.
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a media: ");
		double nota = entrada.nextDouble();
		if (nota <= 10 && nota >= 7) {
			System.out.println("Aluno aprovado");
		} else if (nota < 7 && nota > 5) {
			System.out.println("Aluno de recuperacao");
		} else {
			System.out.println("Aluno reprovado");
		}
		entrada.close();
	}
}
