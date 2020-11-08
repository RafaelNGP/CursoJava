package udemy.colecoes;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"rawtypes", "unchecked"})
public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet hashset = new HashSet();
        hashset.add(1.2); // double -> Double
        hashset.add(true); // boolean -> Boolean
        hashset.add("Test");
        hashset.add(1); // int -> Integer
        hashset.add('x'); // char -> Character

        System.out.println(hashset);
        System.out.println(hashset.size());

        hashset.remove(1);
        System.out.println(hashset);

        System.out.println(hashset.contains(true));
        System.out.println(hashset.contains(1));
        System.out.println(hashset.contains("Test"));

        Set numbers = new HashSet();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        hashset.addAll(numbers);
        System.out.println(hashset);

        hashset.retainAll(numbers);
        System.out.println(hashset);

        hashset.add(true);
        hashset.removeAll(numbers);
        System.out.println(hashset);
    }
}
