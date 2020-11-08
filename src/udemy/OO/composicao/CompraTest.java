package udemy.OO.composicao;

public class CompraTest {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.client = "Rafael";
        c1.listItems.add(new Item("Caneta", 20, 7.45));
        c1.listItems.add(new Item("Borracha", 12, 3.89));
        c1.listItems.add(new Item("Caderno", 3, 18.79));

        var produto1 = new Item("Xbox One X", 1, 4500);
        c1.listItems.add(produto1);
        for (Item i : c1.listItems) {
            System.out.println(i);
        }
        System.out.println(c1.listItems);

        System.out.println(c1.obterValorTotal());
    }
}
