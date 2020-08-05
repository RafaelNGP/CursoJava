package udemy.classe;

public class ProdutoTeste {
	static double carrinho = 0;
	public static void main(String[] args) {

		System.out.println("Todos os itens da loja possuem pelo menos 25% de desconto! VENHAM!");
		System.out.println("A CADA PRODUTO NOVO, UM EXTRA DE 5% DE DESCONTO!\n");

		Produto p1 = new Produto("Calculadora", 10);

		var p2 = new Produto();
		p2.nome = "Notebook";
		p2.preco = 4356.89;

		var p3 = new Produto("Xbox One X", 3000);

		adicionarProdutoCarrinho(p1);
		adicionarProdutoCarrinho(p2);
		adicionarProdutoCarrinho(p3);
		
		System.out.printf("\nTotal carrinho: %.2f\n", carrinho);
		calcularDescontoCarrinho(carrinho);
	}

	static void adicionarProdutoCarrinho(Produto produto) {
		System.out.printf("%s adicionado ao carrinho! Valor: %.2f\n", produto.nome, produto.preco);
		Produto.desconto += 0.05;
		carrinho += produto.preco;
	}

	static void calcularDescontoCarrinho(double totalCarrinho) {
		double totalCarrinhoDesconto = totalCarrinho * (1 - Produto.desconto);
		System.out.printf("Desconto aplicavel: %.0f porcento\n", Produto.desconto * 100);
		System.out.printf("Total com desconto: %.2f", totalCarrinhoDesconto);
	}
}
