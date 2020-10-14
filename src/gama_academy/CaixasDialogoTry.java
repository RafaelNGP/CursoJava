package gama_academy;

import javax.swing.JOptionPane;

public class CaixasDialogoTry {
	public static void main(String[] args) {

		try {
			String nome = JOptionPane.showInputDialog(null, "Digite um numero: ", null, 3);
			int valor = Integer.parseInt(nome);
			JOptionPane.showMessageDialog(null, "O valor digitado foi " + valor);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Por favor, digite um numero inteiro.", "Erro!",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
