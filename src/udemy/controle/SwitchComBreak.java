package udemy.controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String conceito = "";
		System.out.println("Qual a nota do aluno? ");
		int nota = entrada.nextInt();
		
		switch (nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1: case 0:
			conceito = "E";
			break;
		default:
			conceito = "Nao encontrado.";
		}
		
		System.out.println("Ele esta no conceito " + conceito);
		entrada.close();
	}
}