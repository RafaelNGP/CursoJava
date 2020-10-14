package udemy.proprios;

import javax.swing.JOptionPane;

public class PrevisaoCasal {
	public static void main(String[] args) {
		try {
			String nome1 = JOptionPane.showInputDialog(null, "Qual o nome dele?", null, 3);
			String nome2 = JOptionPane.showInputDialog(null, "Qual o nome dela?", null, 3);

			if (nome1.toLowerCase().contains("rafael") && !nome2.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Totalmente compativeis!! <3");
			} else {
				JOptionPane.showMessageDialog(null, "Match perfeito mesmo seria o rafael e a " + nome2.toLowerCase());
			}
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Nao foram inseridos dois valores para serem comparados.", null, 0);
		}
	}
}
