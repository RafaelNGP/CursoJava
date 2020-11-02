package udemy.controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String comando = "";
        while (!comando.equalsIgnoreCase("sair")) {
            System.out.print("Digite um comando: ");
            comando = entrada.nextLine();
        }
        entrada.close();
    }
}
