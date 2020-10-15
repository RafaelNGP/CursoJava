package gama_academy.aula1;

import javax.swing.JOptionPane;

public class CaixasDialogo {
	public static void main(String[] args) {
		String nome;
		String salario;
		int resp;

		try {
			nome = JOptionPane.showInputDialog(null, "Digite seu nome");
			while (nome.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Voce nao digitou um nome!", "Erro 1", 3);
				nome = JOptionPane.showInputDialog(null, "Digite seu nome");
			}
			JOptionPane.showMessageDialog(null, "Seja bem vindo " + nome + "!");
			resp = JOptionPane.showConfirmDialog(null, "Gostaria de atualizar seu salario?");
			switch (resp) {
			case 0:
				salario = JOptionPane.showInputDialog(null, "Qual o valor?").replace(',', '.');
				double salarioConvertido = Double.parseDouble(salario);
				JOptionPane.showMessageDialog(null, "Salario registrado!\nValor atual: " + salarioConvertido);
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "Tudo bem, continue praticando para aumentar esses numeros!");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Ok, operacao cancelada.");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Operacao abortada");
			}

		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Valores nulos detectados. Encerrando.");
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Nao foram digitados numeros. Encerrando.");
		}
	}
}
