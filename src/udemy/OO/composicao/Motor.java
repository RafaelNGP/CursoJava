package udemy.OO.composicao;

public class Motor {
    boolean ligado = false;
    double fatorInjecao = 1.0;

    int giros() {
        if (!ligado)
            return 0;
        else
            return (int) Math.round(fatorInjecao * 3000);
    }

    @Override
    public String toString() {
        return ligado + ", Injecao=" + fatorInjecao;
    }
}
