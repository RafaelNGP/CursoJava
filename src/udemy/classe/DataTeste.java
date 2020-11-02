package udemy.classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 12;
        d1.mes = 01;
        d1.ano = 1993;

        Data d2 = new Data(30, 06, 1966);

//		System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
//		System.out.printf("%d/%d/%d\n", d2.dia, d2.mes, d2.ano);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatadaCurso());
    }
}
