package gama_academy.aula2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da string: ");
        String insertedString = scanner.nextLine();
        System.out.printf("insertedString is: %s", insertedString);
        scanner.close();
    }
}
