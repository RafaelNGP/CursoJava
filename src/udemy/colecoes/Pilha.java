package udemy.colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> listaLivros = new ArrayDeque<>();
        listaLivros.push("The Witcher 1");
        listaLivros.push("The Witcher 2");
        listaLivros.push("The Witcher 3");
        listaLivros.push("The Witcher 4");
        listaLivros.push("The Witcher 5");
        listaLivros.push("The Witcher 6");
        listaLivros.push("The Witcher 7");
        listaLivros.push("The Witcher 8");

        System.out.println(listaLivros.getFirst());
        System.out.println(listaLivros.getLast());
        System.out.println();

        for (String livro : listaLivros) {
            System.out.println(livro);
//            System.out.println(listaLivros.pop());
        }
    }
}
