package udemy.fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia\n");

        System.out.println("Bom");
        System.out.println("dia");

        System.out.printf("Megasena: %d %d %d %d %d %d",
                1, 2, 3, 4, 5, 6);
        System.out.printf("\nSalario: %.1f", 1235.59);
        System.out.printf("\nNome: %s", "Rafael");

        Scanner entrada = new Scanner(System.in);
        try {
            System.out.print("\n\nDigite um nome: ");
            String nome = entrada.nextLine();

            System.out.print("Digite seu sobrenome: ");
            String sobrenome = entrada.nextLine();

            System.out.print("Qual sua idade? ");
            int idade = entrada.nextInt();

            System.out.printf("O nome digitado foi: %s %s "
                    + "\nE voce tem %d anos", nome, sobrenome, idade);

        } catch (Exception inputException) {
            System.out.println("Voce digitou uma idade invalida.");
        } finally {
            entrada.close();
        }
    }
}
