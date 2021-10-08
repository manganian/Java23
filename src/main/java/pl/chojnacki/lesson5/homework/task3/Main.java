package pl.chojnacki.lesson5.homework.task3;

public class Main {
    public static void main(String[] args) {
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        System.out.println(addition.operation(2.5, 2.5, 2.5));
        System.out.println(subtraction.operation(10.5, 2.5, 2.1));
        System.out.println(multiplication.operation(10, 2.2));
        System.out.println(division.operation(10.8, 4.0));
    }
}
