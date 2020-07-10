package udemy.desafios;

public class DesafioArtimeticos {
	public static void main(String[] args) {
//		Como usar a Math
//		int a = 3 * 4 - 10;
//		int b = (int) Math.pow(a, 3);
//
//		System.out.println(b);
		
		double setor1 = ((1-5)*(2-7)/2);
		double resSetor1 = Math.pow(setor1, 2);
		
		double setor2 = (6*(3+2));
		double formula2 = Math.pow(setor2, 2);		
		double resSetor2 = formula2 / (3*2);
		
		double setor3 = resSetor2 - resSetor1;
		double resSetor3 = Math.pow(setor3, 3);
		
		double setor4 = 10;
		double resSetor4 = Math.pow(setor4, 3);
		
		double resFinal = resSetor3/resSetor4;
		System.out.println(resFinal);		
		
	}
}