package udemy.colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        Set<String> list = new HashSet<>();
        list.add("Laura");
        list.add("Rafael");
        list.add("Emily");
        list.add("Sophia");

        for (String nome : list) {
            System.out.println(nome);
        }

        System.out.println();

        TreeSet<String> listTree = new TreeSet<>();
        listTree.add("Rafael");
        listTree.add("Sophia");
        listTree.add("Laura");
        listTree.add("Emily");

        for (String nome : listTree) {
            System.out.println(nome);
        }

        System.out.println();

        Set<Integer> nums = new TreeSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for (int n: nums) {
            System.out.println(n);
        }

    }
}
