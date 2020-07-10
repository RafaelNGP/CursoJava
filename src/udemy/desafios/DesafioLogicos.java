package udemy.desafios;

import javax.swing.JOptionPane;

public class DesafioLogicos {
	public static void main(String[] args) {
//		trabalho na terca feira (V ou F) 
//		trabalho na quinta feira (V ou F)
		
//		Caso os dois sejam verdadeiros, comprar uma TV de 55 polegadas
//		Caso apenas um deles seja verdadeiro, comprar uma TV de 32 polegadas.
//		Caso qualquer TV seja comprada, vao tomar sorvete.
		
		String trabalho1 = JOptionPane.showInputDialog("Vc conseguiu o emprego da terca feira? (v ou f)");
		String trabalho2 = JOptionPane.showInputDialog("Vc conseguiu o emprego da quinta feira? (v ou f)");
		
		if (trabalho1.contains("v") && trabalho2.contains("v")) {
			JOptionPane.showMessageDialog(null, "Vc comprou uma TV de 55 polegadas e foram tomar sorvete!");
		} else if (trabalho1.contains("v") ^ trabalho2.contains("v")) {
			JOptionPane.showMessageDialog(null, "Vc comprou uma TV de 32 polegadas e foram tomar sorvete!");
		} else if (trabalho1.contains("f") && trabalho2.contains("f")) {
			JOptionPane.showMessageDialog(null, "Vc ficou em casa, nenhum trabalho foi conseguido ... sem sorvete pra galera.");
		}
	}
}