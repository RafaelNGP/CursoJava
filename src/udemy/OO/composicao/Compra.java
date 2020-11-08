package udemy.OO.composicao;

import java.util.ArrayList;

public class Compra {

    String client;
    ArrayList<Item> listItems = new ArrayList<>();

    double obterValorTotal() {
        double valor = 0;
        for (Item item : listItems) {
            valor += item.quantity * item.price;
        }
        return valor;
    }

}
