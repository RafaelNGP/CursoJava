package udemy.classe.mercado;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.20;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto() {
    }
}
