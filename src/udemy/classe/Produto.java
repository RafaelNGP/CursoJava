package udemy.classe;

public class Produto {
	String nome;
	double preco;
	double desconto;
	
	Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public Produto() {
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComMaisDesconto(double valorExtra) {
		return preco * (1 - (desconto + valorExtra));
	}
}
