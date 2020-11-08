package udemy.desafios;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
//		ler num1
//		ler num2
//		perguntar qual operacao + - * / %

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double num1 = entrada.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double num2 = entrada.nextDouble();

        System.out.println("Digite uma operacao ( + - * / % ): ");
        String operacao = entrada.next();

//		Minha resolucao
//		double modulo = operacao.equals("%") ? num1 % num2 : 0 ;
//		double multiplicacao = operacao.equals("*") ? num1 * num2 : modulo;
//		double divisao = operacao.equals("/") ? num1 / num2 : multiplicacao;
//		double subtracao = operacao.equals("-") ? num1 - num2 : divisao;
//		double soma = operacao.equals("+") ? num1 + num2 : subtracao; 
//		System.out.println(soma);


//		Resolucao do curso:
        double resultado;
        resultado = "+".equals(operacao) ? num1 + num2 : 0;
        resultado = "-".equals(operacao) ? num1 - num2 : resultado;
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;
        resultado = "%".equals(operacao) ? num1 % num2 : resultado;

        System.out.println(resultado);
        entrada.close();
    }
}