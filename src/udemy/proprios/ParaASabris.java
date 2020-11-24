package udemy.proprios;

import java.util.Scanner;

public class ParaASabris {
    public static void main(String[] args) {
        String[] arrayNomes = new String[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arrayNomes.length; i++) {
            System.out.printf("Digite o nome do %d aluno: ", i + 1);
            arrayNomes[i] = scanner.nextLine();
        }

        for (String nome : arrayNomes) {
            System.out.println(nome);
        }

        System.out.println("\nAté aqui tudo bem!\n");

        // Tente adicionar mais um elemento!
        System.out.println("Digite o nome do 6 aluno: ");
        arrayNomes[6] = scanner.nextLine();

        scanner.close();
    }
}
