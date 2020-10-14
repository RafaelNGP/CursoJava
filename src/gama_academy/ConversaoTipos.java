package gama_academy;

public class ConversaoTipos {
	public static void main(String[] args) {
		byte mbyte = 10;
		short mshort = 20;
		int mint = 30;
		long mlong = 40;
		float mfloat = 50.0f;
		double mdouble = 60.0;

		int a = mbyte;
		long b = (long) mdouble;
		double c = mfloat;
		short d = (short) mlong;
		long e = (long) mint;
		double f = (double) mshort;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
}
