package pl.chojnacki.lesson5.homework.task3;

public class Multiplication implements Operation {

    @Override
    public double operation(double... values) {
        double multi = 1;
        for (double value : values) {
            multi *= value;
        }

        return multi;
    }
}
