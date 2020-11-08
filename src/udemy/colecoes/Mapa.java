package udemy.colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> users = new HashMap<>();
        users.put(1, "Rafael");
        users.put(2, "Laura");

        System.out.println(users.size());
        System.out.println(users.isEmpty());

        System.out.println(users.keySet());
        System.out.println(users.values());

        System.out.println(users.entrySet());
        System.out.println(users.containsKey(1));
        System.out.println(users.containsValue("Laura"));

        System.out.println(users.get(1));
        System.out.println(users.get(2));

        for (int chave : users.keySet()) {
            System.out.println(chave);
        }

        for (String name : users.values()) {
            System.out.println(name);
        }

        for (Map.Entry<Integer, String> registro : users.entrySet()) {
            System.out.print(registro.getKey() + " ==> ");
            System.out.println(registro.getValue());
        }

        users.forEach((id, name) -> System.out.println(id + " ==> " + name));
    }
}
