package hacker_rank;

public class Simple_array_sum {
    public static void main(String[] args) {
    int[] simpleArray = new int[3];
    simpleArray[0] = 3;
    simpleArray[1] = 4;
    simpleArray[2] = 5;

    System.out.println(sumArray(simpleArray));

    }

    public static int sumArray(int[] arrayName){
        int result = 0;
        for (int j : arrayName) {
           result += j;
        }
           return result;
    }
}
