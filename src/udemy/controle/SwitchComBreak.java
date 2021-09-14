package udemy.controle;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String conceito = "";
        System.out.println("Qual a nota do aluno? ");
        int nota = entrada.nextInt();


        System.out.println("Ele esta no conceito " + conceito);
        entrada.close();
    }
}