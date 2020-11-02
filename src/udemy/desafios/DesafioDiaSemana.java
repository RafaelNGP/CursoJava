package udemy.desafios;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um dia da semana: ");
        String dia = entrada.next().toLowerCase();

        if (dia.contains("dom")) {
            System.out.println("Domingo significa 1");
        } else if (dia.contains("seg")) {
            System.out.println("Segunda significa 2");
        } else if (dia.contains("ter")) {
            System.out.println("Terca significa 3");
        } else if (dia.contains("qua")) {
            System.out.println("Quarta significa 4");
        } else if (dia.contains("qui")) {
            System.out.println("Quinta significa 5");
        } else if (dia.contains("sex")) {
            System.out.println("Sexta significa 6");
        } else if (dia.contains("sab")) {
            System.out.println("Sabado significa 7");
        } else {
            System.out.println("Nenhum valor valido foi inserido.");
        }
        entrada.close();
    }
}