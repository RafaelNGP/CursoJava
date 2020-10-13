package gama_academy;

import javax.swing.JOptionPane;

public class TryCaixasDialogo {
	public static void main(String[] args) {
		
		try {
			String nome = JOptionPane.showInputDialog("Digite um numero: ");
			int valor = Integer.parseInt(nome);
			JOptionPane.showMessageDialog(null, valor);
		}catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Por favor, digite um numero inteiro.", "Erro!", JOptionPane.ERROR_MESSAGE);
		}
	}
}
