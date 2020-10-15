package gama_academy.aula2;

import java.util.List;

public class ex3 {
    public static void main(String[] args) {
       int[] stdin = new int[3];
       stdin[0] = 3;
       stdin[1] = 4;
       stdin[2] = 18;

        var stdin2 = List.of(
                3, 4, 18
        );

        for (int j : stdin) {
            System.out.println(j);
        }

        System.out.println();

        for (int j : stdin2) {
            System.out.println(j);
        }

    }
}
