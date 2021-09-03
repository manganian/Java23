package pl.chojnacki.lesson2.homework;

public class Numbers {
    public static String checkNumberIsEven(int number) {
        if (number % 2 == 0 && number > 0) {
            return "A number is even.";
        }
        else if (number % 2 != 0 && number > 0) {
            return "A number is odd.";
        }
        else {
            return "Enter a number between 1 and 2 147 483 647";
        }
    }
}

