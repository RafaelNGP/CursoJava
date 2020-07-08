package udemy;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
//		implicito, pois um double recebeu um int, mas nao existe perda de valor.
		double a = 1;
		System.out.println(a);
		
//		explicito, pois estamos fazendo o casting do valor.
		float b = (float) 1.0;
		System.out.println(b);
		
//		explicito, mas devido a capacidade do byte vai ficar um valor truncado. 
		int c = 130;
		byte d = (byte) c;
		System.out.println(d);
		
//		explicito, mas existe perda de informacao.
		double e = 1.99999;
		int f = (int) e;
		System.out.println(f);
	}
}