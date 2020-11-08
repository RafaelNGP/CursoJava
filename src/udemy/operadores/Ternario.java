package udemy.operadores;

import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a media do aluno? ");
        double media = entrada.nextDouble();
        String resultadoRecuperacao = media >= 5.0 ? "recuperacao" : "reprovado";
        String resultado = media >= 7.0 ? "aprovado" : resultadoRecuperacao;
        System.out.println("O aluno esta " + resultado);
        entrada.close();
    }
}
