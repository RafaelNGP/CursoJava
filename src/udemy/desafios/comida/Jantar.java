package udemy.desafios.comida;

public class Jantar {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Rafael", 80);
        double pesoInicial = pessoa1.peso;

        System.out.println("Seja bem vindo ao restaurante, " + pessoa1.nome);
        System.out.println("Qual sera seu pedido?");
        System.out.println("...");

        Comida comida1 = new Comida("Burger", 0.20);
        Comida comida2 = new Comida("Batata Frita", 0.15);
        Comida comida3 = new Comida("Bolo", 0.50);
        System.out.println("Um momento por favor, iremos preparar seu pedido!");
        System.out.println("- um tempo se passa -");
        System.out.println("Aqui esta, bom apetite!");
        pessoa1.comerComida(comida1);
        pessoa1.comerComida(comida2);
        pessoa1.comerComida(comida3);

        System.out.printf("\n\n%s: Ufa! Estou satisfeito!", pessoa1.nome);
        System.out.println("\nVamos ver quanto estou pesando...");
        System.out.printf("\nInicial: %.2fKg", pesoInicial);
        System.out.printf("\nBalanca: %.2fKg", pessoa1.peso);
        System.out.println("... quero morrer.");
    }
}
