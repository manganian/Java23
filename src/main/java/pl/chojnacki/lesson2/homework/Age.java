package pl.chojnacki.lesson2.homework;

public class Age {

    public static String ageVerification(int age) {
        if (age < 18) {
            return "Your age is below 18.";
        }
        else {
            return "Your age is 18 or above 18.";
        }
    }
}
