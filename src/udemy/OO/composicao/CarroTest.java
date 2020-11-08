package udemy.OO.composicao;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro();

        c1.ligarOuDesligar();                               // ligando o motor
        System.out.println(c1 + " " + c1.motor.giros());    // 3000 rpm
        c1.acelerar();                                      // 4200 rpm
        c1.acelerar();                                      // 5400 rpm
        c1.acelerar();                                      // 6600 rpm
        c1.acelerar();                                      // 7800 rpm
        c1.acelerar();                                      // 9000 rpm
        System.out.println(c1 + " " + c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        System.out.println(c1 + " " + c1.motor.giros());

    }
}
