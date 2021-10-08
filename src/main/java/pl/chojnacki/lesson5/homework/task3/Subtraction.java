package pl.chojnacki.lesson5.homework.task3;

public class Subtraction implements Operation {

    @Override
    public double operation(double... values) {
        if (values.length > 0) {
            double sub = values[0];
            for (int i = 1; i < values.length; i++) {
                sub -= values[i];
            }
            return sub;
        }
        return 0;
    }
}
