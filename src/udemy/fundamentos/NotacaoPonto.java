package udemy.fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bom dia X";
        System.out.println(s);
        System.out.println(s.toUpperCase());

        s = s.toUpperCase();
        System.out.println(s);
        System.out.println(s.replace("X", "Senhora").toUpperCase());
        s = s.concat("!!!");
        System.out.println(s);
        System.out.println("rafa".toUpperCase());
        s = "Rafa".toUpperCase().concat("!!!");
        System.out.println(s);

        String y = "Bom dia Y"
                .replace("Y", "Rafa")
                .toLowerCase()
                .concat("!!!");
        System.out.println(y);
    }
}