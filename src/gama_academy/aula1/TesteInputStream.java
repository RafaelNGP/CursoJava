package gama_academy.aula1;

import java.io.IOException;

public class TesteInputStream {
	public static void main(String[] args) {
		try {
			byte mbyte[] = new byte[100];
			System.out.println("Digite a sua idade: ");
			System.in.read(mbyte);
			String mString = new String(mbyte).trim();
			int idade = Integer.parseInt(mString);
			System.out.println("Idade convertida em int: " + idade);
		} catch (IOException e) {
			System.out.println("Erro de I/O");
		} catch (NumberFormatException e) {
			System.out.println("Erro na conversao");
		}
	}
}
