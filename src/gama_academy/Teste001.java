package gama_academy;

public class Teste001 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 20;
		
		int d = ++a + b-- - c++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		int x = 30;
		int y = 14;
		int z = x--/++y;
		int w = 10*z++;
		int k = --w%2;
		
		System.out.println();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(w);
		System.out.println(k);	
		
		int p = 3;
		int t = 4;
		int z2 = 5;
		int x2 = 2;
		int w2 = 1;
		int r = 6;
		
		int m = (p++ - t--) * z2 + ++x2* (w2++ - --r);
		System.out.println();
		System.out.println(m);
		System.out.println(p);
		System.out.println(t);
		System.out.println(z2);
		System.out.println(x2);
		System.out.println(w2);
		System.out.println(r);	
		
		int xx = 1;
		int yy = 2;
		int zz = 10;
		int cc = 3;
		int ww = 4;
		int rr = 5;
		int mm = 6;
		int nn = 7;
		int tt = 8;
		
		int bb = xx * yy + zz % 4 - cc + ww * (rr + (mm + (nn + tt)));
		System.out.println();
		System.out.println(bb);		
	}
}