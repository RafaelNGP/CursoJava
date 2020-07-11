package udemy.fundamentos;

import java.util.Scanner;

public class TipoStringsEquals {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("2" == "2");				// true

		String s = new String("2");
		System.out.println("2" == s);				// false
		System.out.println(s == "2");				// false

		s = "2";
		System.out.println("2" == s);				// true
		System.out.println("2".equals(s));			// true
		
		System.out.println("Digite 2: ");
		s = entrada.nextLine();						// Nao precisaria do trim() se fosse apenas next()
		System.out.println("2" == s.trim());		// false
		System.out.println(s.trim() == "2");		// false
		
		System.out.println("2".equals(s.trim())); 	// true
		entrada.close();
	}
}
