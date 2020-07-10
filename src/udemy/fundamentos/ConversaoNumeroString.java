package udemy.fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
//		Transformando o valor numerico em String.
		Integer num1 = 10000;
		System.out.println(num1.toString());
		System.out.println(num1.toString().length());
		
		int num2 = 10000;
		System.out.println(Integer.toString(num2));
		System.out.println(Integer.toString(num2).length());	
		
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
	}
}