package udemy.classe;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a = new AreaCirc(5.6);
        System.out.println(a.area());

        AreaCirc a2 = new AreaCirc(5.6);
//		AreaCirc.pi = 3.14;
        System.out.println(a2.area());

        System.out.println(AreaCirc.PI);
        System.out.println(Math.PI);
    }
}
