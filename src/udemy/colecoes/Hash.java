package udemy.colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> users = new HashSet<>();
        users.add(new Usuario("Rafael"));
        users.add(new Usuario("Laura"));
        users.add(new Usuario("Sophia"));

        System.out.println(users.contains(new Usuario("Rafael")));
    }
}
