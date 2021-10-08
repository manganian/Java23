package pl.chojnacki.lesson5.homework.task3;

public class Addition implements Operation {

    @Override
    public double operation(double... values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }

        return sum;

    }
}
