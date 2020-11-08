package udemy.classe.mercado;

public class Carrinho {

    static double carrinho;
    static void adicionarProdutoCarrinho(Produto produto) {
        System.out.printf("%s adicionado ao carrinho! Valor: %.2f\n", produto.nome, produto.preco);
        Produto.desconto += 0.05;
        carrinho += produto.preco;
    }

    static void removerProdutoCarrinho(Produto produto) {
        System.out.printf("%s removido do carrinho! Valor: -%.2f\n", produto.nome, produto.preco);
        Produto.desconto -= 0.05;
        carrinho -= produto.preco;
    }

    static void calcularDescontoCarrinho(double totalCarrinho) {
        double totalCarrinhoDesconto = totalCarrinho * (1 - Produto.desconto);
        System.out.printf("Desconto aplicavel: %.0f porcento\n", Produto.desconto * 100);
        System.out.printf("Total com desconto: %.2f", totalCarrinhoDesconto);
    }
}
