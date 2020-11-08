package udemy.controle;

public class For1 {

    public static void main(String[] args) {
        for (int contador = 0; contador <= 10; contador++) {
            System.out.println("Contador = " + contador);
        }

        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Pares = " + i);
        }

//		Tambem da certo, mas confuso.
//		int x = 2;
//		for (; x < 10;) {
//			System.out.println("x = " + x);
//			x++;
//		}

//		infinito
//		for (;;) {
//			System.out.println("ao infinito e ...");
//		}
    }
}
