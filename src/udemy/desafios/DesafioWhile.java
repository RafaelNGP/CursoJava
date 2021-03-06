package udemy.desafios;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

//		O programa vai calcular a media da sala, nao se sabe qual a quantidade de alunos
//		so vai parar quando for digitado -1.
        Scanner entrada = new Scanner(System.in);
        String comando = "";
        int alunos = 0;
        double notas = 0;
        while (!comando.equals("-1")) {
            System.out.println("Digite a nota do aluno: ");
            comando = entrada.next().replace(",", ".");

            if (Double.parseDouble(comando) <= 10 && Double.parseDouble(comando) >= 0) {
                notas += Double.parseDouble(comando);
                alunos++;
            } else if (Double.parseDouble(comando) != -1) {
                System.out.println("Nota invalida!");
            }
        }
        double media = notas / alunos;
        System.out.printf("Nosso sistema contem: %d alunos e a media da sala eh de %.2f", alunos, media);
        entrada.close();
    }
}
