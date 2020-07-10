package udemy.fundamentos;

import java.util.Date;

public class Imports {
	public static void main(String[] args) {
//		Caminho completo, mas nao eh necessario
		java.lang.String b = "Bom dia!";
		java.lang.System.out.println(b);
				
		String s = "Bom dia!";
		System.out.println(s);
		
		Date d = new Date();
		System.out.println(d);
		
//		JButton botao = new JButton();
//		Ctrl + Shift + O otimiza os imports
	}
}
