package udemy;

import javax.swing.JOptionPane;

public class PrevisaoCasal {
	public static void main(String[] args) {
		String nome1 = JOptionPane.showInputDialog("Qual o nome dele?");
		String nome2 = JOptionPane.showInputDialog("Qual o nome dela?");
		
		if (nome1.toLowerCase().contains("rafael") && nome2.toLowerCase().contains("beatriz")) {
			JOptionPane.showMessageDialog(null, "Totalmente compativeis!! <3");
		} else {
			JOptionPane.showMessageDialog(null, "nao sao tao perfeitos quanto o rafa e a bea");
		}
	}
}