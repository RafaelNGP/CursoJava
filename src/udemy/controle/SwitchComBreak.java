package udemy.controle;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String conceito = "";
        System.out.println("Qual a nota do aluno? ");
        int nota = entrada.nextInt();

        conceito = switch (nota) {
            case 10, 9 -> "A";
            case 8, 7 -> "B";
            case 6, 5 -> "C";
            case 4, 3 -> "D";
            case 2, 1, 0 -> "E";
            default -> "Nao encontrado.";
        };

        System.out.println("Ele esta no conceito " + conceito);
        entrada.close();
    }
}