package udemy.desafios;

import java.util.Scanner;

public class ConceitosBasicosEx4 {
    public static void main(String[] args) {
//		Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor para elevar ao quadrado e ao cubo:");
        double valor = entrada.nextDouble();

        double quadrado = valor * valor;
        double cubo = valor * valor * valor;

        System.out.println("Valor: " + valor);
        System.out.println("Quadrado: " + quadrado);
        System.out.println("Cubo: " + cubo);

        entrada.close();
    }
}
