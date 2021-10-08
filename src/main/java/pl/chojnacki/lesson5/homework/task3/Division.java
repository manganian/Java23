package pl.chojnacki.lesson5.homework.task3;

public class Division implements Operation {

    @Override
    public double operation(double... values) {
        if (values.length > 0) {
            double division = values[0];
            for (int i = 1; i < values.length; i++) {
                division /= values[i];
            }
            return division;
        }
        return 0;
    }
}
