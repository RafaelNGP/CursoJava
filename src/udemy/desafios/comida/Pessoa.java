package udemy.desafios.comida;

public class Pessoa {

	String nome;
	double peso;

	public Pessoa() {
	}

	public Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	void comerComida(Comida comida) {
		System.out.printf("\nComendo %s", comida.nomeComida);
		this.peso += comida.pesoComida;
//		System.out.println("\nit was super effective!");
	}
}
