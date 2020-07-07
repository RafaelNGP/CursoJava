package udemy;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
//		Wrapper dos tipos primitivos:
		Scanner entrada = new Scanner(System.in);

		try {
			System.out.println("Valor de Byte: ");
			Byte b = entrada.nextByte();
			
			System.out.println("Valor de Short: ");
			Short s = entrada.nextShort();
			
			System.out.println("Valor de Integer: ");
			Integer i = entrada.nextInt();
			
			System.out.println("Valor de Long: ");
			Long l = entrada.nextLong();
		
			System.out.println(b.doubleValue());
			System.out.println(s.toString());
			System.out.println(i);
			System.out.println(l);

			//		Outra forma.
			System.out.println("Valor de Byte: ");
			b = Byte.parseByte(entrada.next());
					
			System.out.println("Valor de Short: ");
			s = Short.parseShort(entrada.next());
			
			System.out.println("Valor de Integer: ");
			i = Integer.parseInt(entrada.next());
			
			System.out.println("Valor de Long: ");
			l = Long.parseLong(entrada.next());
			
			System.out.printf("Byte: %d\n"
					+ "Short: %d\n"
					+ "Integer: %d\n"
					+ "Long: %d\n\n",
					b,s,i,l);
			
			System.out.printf("Short * 2 = %d\n"
					+ "Integer / 5 = %d\n"
					+ "Byte como byteValue: %d\n"
					+ "Long como uma String: %s", s * 2, i / 5, b.byteValue(), l.toString().concat("!!!") );
			
			Boolean bo = Boolean.parseBoolean("true");
			System.out.println(bo.toString().toUpperCase());
			
			Character c = '#';
			System.out.println(c + "...");
			
			Float f = 123.10F;
			System.out.println(f.isInfinite());
			
			Double d = 1234.5678;
			System.out.println(d.isInfinite());
			
		} catch (Exception inputException) {
			System.out.println("Erro detectado, abortando operacao.");
		} finally {
			entrada.close();
		}
	}
}
