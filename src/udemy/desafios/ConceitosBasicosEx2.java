package udemy.desafios;

import java.util.Scanner;

public class ConceitosBasicosEx2 {

    public static void main(String[] args) {
//		Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
//		formula = °C = (°F − 32) ÷ 1, 8

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor em F: ");
        double fah = entrada.nextDouble();
        double formulaCelsius = (fah - 32) / 1.8;
        System.out.println("Temperatura em celsius: " + formulaCelsius);

        entrada.close();
    }
}