package udemy.OO.composicao;

public class Item {
    String nome;
    int quantity;
    double price;

    public Item(String nome, int quantity, double price) {
        this.nome = nome;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
