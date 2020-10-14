package udemy.desafios;

import java.util.Scanner;

public class DesafioDiaSemanaSwitch {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha um destes: seg, ter, qua, qui, sex, sab ou dom");
		System.out.print("Digite um dia da semana: ");
		String dia = entrada.next().toLowerCase();

		switch (dia) {
		case "dom": {
			System.out.println("Domingo significa 1");
			break;
		}
		case "seg": {
			System.out.println("Segunda significa 2");
			break;
		}
		case "ter": {
			System.out.println("Terca significa 3");
			break;
		}
		case "qua": {
			System.out.println("Quarta significa 4");
			break;
		}
		case "qui": {
			System.out.println("Quinta significa 5");
			break;
		}
		case "sex": {
			System.out.println("Sexta significa 6");
			break;
		}
		case "sab": {
			System.out.println("Sabado significa 7");
			break;
		}
		default: {
			System.out.println("Nenhum valor valido foi inserido.");
			System.out.println("Tente algo como 'seg' ou 'ter'");
		}
		}
		entrada.close();
	}
}
