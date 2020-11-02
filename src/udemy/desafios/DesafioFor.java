package udemy.desafios;

public class DesafioFor {
    public static void main(String[] args) {
        String valor = "#";
        for (int i = 1; i <= 5; i++) {
            System.out.println(valor);
            valor += "#";
        }

//		Versao do desafio
//		Nao pode usar valor numerico para controlar o laco!

        valor = "#";
        for (; !valor.equals("######"); valor += "#") {
            System.out.println(valor);
        }
    }
}
