package gama_academy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploNextDouble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Entre com um valor: ");
			double num = sc.nextDouble();
			System.out.println("num: " + num);
		} catch (InputMismatchException e) {
			System.out.println("Valor incorreto.");
		}
		sc.close();
	}
}
