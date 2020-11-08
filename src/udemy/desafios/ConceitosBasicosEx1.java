package udemy.desafios;

import java.util.Scanner;

public class ConceitosBasicosEx1 {

    public static void main(String[] args) {
//		Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
//		formula = celsius / 5 = (fahrenheit - 32) / 9

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a temperatura em C: ");
        double celsius = entrada.nextDouble();

        double formulaFahrenheit = (celsius / 5) * 9 + 32;
        System.out.println("Resultado foi: " + formulaFahrenheit);

        entrada.close();
    }
}
