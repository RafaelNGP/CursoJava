package gama_academy;

public class ExemploStringBuffer {
	public static void main(String[] args) {
		int num = 450;
		StringBuffer sb = new StringBuffer();
		ExemploStringBuffer ex = new ExemploStringBuffer();
		
		sb.append("String inserida na funcao main");
		System.out.println(num);
		System.out.println(sb.toString());
		ex.alterar(sb, num);
		System.out.println(num);
		System.out.println(sb.toString());
	}
	
	public void alterar(StringBuffer sb, int num) {
		sb.reverse();
		num = 300;
	}
}
