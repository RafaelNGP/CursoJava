package udemy.desafios;

public class ConceitosBasicosEx6 {
	public static void main(String[] args) {
//		Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. 
//		Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
		
//		Calculando o delta.
//		b2 - 4*a*c
		
		int a = 1;
		int b = 12;
		int c = -13;
		
		int delta = (b*b) - 4*a*c;
		double raizDelta = Math.sqrt(delta);
		
//		Calculando baskara
//		-B +- raiz delta / 2.a
		
		double baskaraMais = (-b + raizDelta) / 2 * a;
		double baskaraMenos = (-b - raizDelta) / 2 * a;
		
		System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);
		System.out.println("Delta = " + delta);
		System.out.println("Raiz Delta = " + raizDelta);
		System.out.println("Baskara+ = " + baskaraMais);
		System.out.println("Baskara- = " + baskaraMenos);
	}	
}