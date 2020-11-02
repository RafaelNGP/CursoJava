package udemy.fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {
    public static void main(String[] args) {

//		Imputando valores.
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero:");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo numero:");

//		Testando que String nao soma, vai concatenar.
        System.out.println(valor1 + valor2);

//		Convertendo String para int, usando parseInt.
        int valor3 = Integer.parseInt(valor1);
        int valor4 = Integer.parseInt(valor2);
        System.out.println(valor3 + valor4);

//		Convertendo String para double, usando parseDouble.
//		Quando precisao eh extremamente importante, importar o BigDecimal		
        double valor5 = Double.parseDouble(valor1);
        double valor6 = Double.parseDouble(valor2);
        System.out.println(valor5 + valor6);
        System.out.println((valor5 + valor6) / 2);
    }
}