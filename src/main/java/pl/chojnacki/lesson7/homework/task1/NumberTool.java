package pl.chojnacki.lesson7.homework.task1;

public class NumberTool {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int calculateSumOfDigits(int number) {
        int sum = 0;

        if (number < 0) {
            number = -number;
        }

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
