package udemy.desafios;

import java.util.Scanner;

public class ConceitosBasicosEx3 {
	public static void main(String[] args) {
//		Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
//		O IMC é calculado dividindo o peso pela altura elevada ao quadrado.
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual a altura do usuario? ");
		double altura = entrada.nextDouble();
		
		System.out.println("Qual o peso do usuario? ");
		int peso = entrada.nextInt();
		
		int IMC = (int) (peso / (altura * altura));
		System.out.println("O IMC do usuario eh: " + IMC);
		System.out.println("\nConfira a tabela\n"
				+ "Entre 18,5 e 24,9 -> Peso normal\n"
				+ "Entre 25,0 e 29,9 -> Sobrepeso\n"
				+ "Entre 30,0 e 34,9 -> Obesidade Grau 1\n"
				+ "Entre 35,0 e 39,9 -> Obesidade Grau 2\n"
				+ "Acima dos 40      -> Obesidade Grau 3");
		entrada.close();
	}
}
