package udemy.classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.nome = "Calculadora";
		p1.preco = 10;
		p1.desconto = 0.10;

		var p2 = new Produto();
		p2.nome = "Notebook";
		p2.preco = 4356.89;
		p2.desconto = 0.25;

		System.out.printf(
				"Sistema de gerenciamento de estoque: \n"
						+ "Produto em destaque: %s saindo por %.2f com %.0f porcento de desconto!\n"
						+ "Produto mais vendido: %s saindo por %.2f com %.0f porcento de desconto!\n",
				p1.nome, p1.preco, p1.desconto * 100, p2.nome, p2.preco, p2.desconto * 100);

		System.out.printf("Preco final do %s: %.0f", p2.nome, p2.preco - (p2.preco * p2.desconto));
	}
}