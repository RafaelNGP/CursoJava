package udemy.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Rafael");
        queue.offer("Bia");
        queue.add("Laura");
        queue.offer("Sophia");
        queue.add("Marcela");


        System.out.println(queue.peek());       // Obtendo o prox elemento sem remover da fila
        System.out.println(queue.element());    // gera NoSuchElementException em caso de null
        System.out.println(queue);

        System.out.println(queue.poll());       // Obtendo o prox elemento E remove da fila
        System.out.println(queue.remove());     // gera NoSuchElementException em caso de null
        System.out.println(queue);

    }
}
