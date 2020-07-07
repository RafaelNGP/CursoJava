package udemy;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Hello World".charAt(0));
		System.out.println("Hello World".charAt(5));
		System.out.println("Hello World".charAt(8));
		System.out.println("Hello World".charAt(10));

		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		s = "Bom dia";
		System.out.println(s + "!!!");

		System.out.println(s.startsWith("Bom"));
		System.out.println(s.toLowerCase().startsWith("Bom"));
		System.out.println(s.endsWith("!"));
		System.out.println(s.length());
		System.out.println(s.equals("bom dia"));
		System.out.println(s.equalsIgnoreCase("bom dia"));

		var nome = "Rafael";
		var sobrenome = "Ferreira";
		var idade = 27;
		var salario = 50.0;

		System.out.println(
				"Nome: " + nome + 
				"\nSobrenome: " + sobrenome + 
				"\nIdade: " + idade + 
				"\nSalario: " + salario + 
				"\n\n");

//		Montando direto dentro do syso.
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f reais", nome, sobrenome, idade, salario);
	
//		Fazendo o mesmo, mas primeiro passando para dentro de uma variavel String.
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f reais", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
//		Alguns testes de String
		String testes = "Bora testar";
		System.out.println(testes.compareTo(nome));
		System.out.println(testes.contains("testa"));
		System.out.println(testes.charAt(7));
		System.out.println(testes.isBlank());
		System.out.println(testes.isEmpty());
		System.out.println(testes.concat(" ").repeat(4));
		System.out.println(testes.substring(5));
		System.out.println(testes.substring(5, 8));		
	}
}
