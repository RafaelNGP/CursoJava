package udemy.OO.composicao;

public class Carro {

    final Motor motor = new Motor();
    public Carro() {
    }

    void acelerar() {
        if (motor.ligado && motor.fatorInjecao < 2.6)
            motor.fatorInjecao += 0.4;
    }

    void frear() {
        if (motor.fatorInjecao > 0.5)
            motor.fatorInjecao -= 0.4;
    }

    void ligarOuDesligar() {
        motor.ligado = !motor.ligado;
    }

    boolean estaLigado() {
        return motor.ligado;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "motor=" + motor +
                '}';
    }
}
