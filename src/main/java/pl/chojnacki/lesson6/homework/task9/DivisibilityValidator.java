package pl.chojnacki.lesson6.homework.task9;

public class DivisibilityValidator {
    public static void validate(int number) {
        try {
            if (number % 3 != 0) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println(number + " is indivisible by 3");
        }

        int result = number / 3;
        System.out.println(number + "/3 = " + result);
    }
}
