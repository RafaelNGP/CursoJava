package gama_academy.aula2;

public class FirstClass {

    String date;
    int students;

    public FirstClass(String date, int students) {
        this.date = date;
        this.students = students;
    }

    public static FirstClass withNewDate (String date){
        return new FirstClass(date);
    }

    private FirstClass(String date){
        this.date = date;
    }

    public static void main(String[] args) {
        var firstClassOf2020 = new FirstClass("1234/123/123", 14);
        System.out.println(firstClassOf2020);
        System.out.println(firstClassOf2020.date);
        System.out.println(firstClassOf2020.students);
        var firstClassOf2021 = FirstClass.withNewDate("2021/12");

        System.out.println(firstClassOf2021.date);
    }
}
