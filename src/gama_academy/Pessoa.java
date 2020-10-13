package gama_academy;

public class Pessoa {
	String nome;
	byte idade;
	String endereco;
	float salario;

	public void alterarEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void alterarIdade(byte idade) {
		this.idade = idade;
	}

	public byte devolverIdade() {
		return this.idade;
	}
}
