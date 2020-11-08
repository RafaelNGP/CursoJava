package udemy.colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<Usuario> userArrayList = new ArrayList<>();

        Usuario usuario = new Usuario("Ana");
        userArrayList.add(usuario);

        userArrayList.add(new Usuario("Rafael"));
        userArrayList.add(new Usuario("Laura"));
        userArrayList.add(new Usuario("Laura"));
        userArrayList.add(new Usuario("Sophia"));
        userArrayList.add(new Usuario("Jessica"));

        for (Usuario u : userArrayList) {
            System.out.println(u);
        }

        System.out.println("\n" + userArrayList.get(3));
        userArrayList.remove(2); // Removing Laura
        userArrayList.remove(new Usuario("Jessica"));
        System.out.println(userArrayList.contains(new Usuario("Rafael")));

        System.out.println(userArrayList);
    }
}
