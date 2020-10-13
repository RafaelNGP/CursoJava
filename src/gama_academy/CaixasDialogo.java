package gama_academy;

import javax.swing.JOptionPane;

public class CaixasDialogo {
	public static void main(String[] args) {
		String nome;
		int salario;
		int resp;
		
		nome = JOptionPane.showInputDialog(null, "Digite seu nome");
		JOptionPane.showMessageDialog(null, "Quer dizer entao que seu nome eh " + nome + "?");
		resp = JOptionPane.showConfirmDialog(null, "Deseja continuar a execucao do programa?");
		JOptionPane.showMessageDialog(null, "Sua resposta " + resp);
	}
}
