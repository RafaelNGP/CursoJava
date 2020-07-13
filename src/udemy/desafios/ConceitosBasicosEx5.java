package udemy.desafios;

import javax.swing.JOptionPane;

public class ConceitosBasicosEx5 {
	public static void main(String[] args) {
//		Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
		String base = JOptionPane.showInputDialog("Qual a base do triangulo?").replace(",", ".");
		String altura = JOptionPane.showInputDialog("Qual a altura do triangulo?").replace(",", ".");
		
		double baseCalculo = Double.parseDouble(base);
		double alturaCalculo = Double.parseDouble(altura);
		
		double resultado = (baseCalculo * alturaCalculo) / 2;
		JOptionPane.showMessageDialog(null, "A Area de um triangulo '" + base + " x " + altura + "' eh de: " + resultado);
	}
}
