package udemy.classe.mercado;

public class ProdutoTeste {
	public static void main(String[] args) {

		System.out.println("Todos os itens da loja possuem pelo menos 25% de desconto! VENHAM!");
		System.out.println("A CADA PRODUTO NOVO, UM EXTRA DE 5% DE DESCONTO!\n");

		Produto p1 = new Produto("Calculadora", 10);

		var p2 = new Produto();
		p2.nome = "Notebook";
		p2.preco = 4356.89;

		var p3 = new Produto("Xbox One X", 3000);

		Carrinho.adicionarProdutoCarrinho(p1);
		Carrinho.adicionarProdutoCarrinho(p2);
		Carrinho.adicionarProdutoCarrinho(p3);
		Carrinho.removerProdutoCarrinho(p1);
		
		System.out.printf("\nTotal carrinho: %.2f\n", Carrinho.carrinho);
		Carrinho.calcularDescontoCarrinho(Carrinho.carrinho);
	}
}
