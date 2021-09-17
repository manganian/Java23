package pl.chojnacki.lesson6.homework.task8;

public class PeselValidator {
    public static void validatePesel (String peselNumber) {
        if (!(peselNumber.matches("[0-9]+"))) {
            throw new WrongTypeOfDataException("Pesel should be composed of all numbers.");
        }
        if (peselNumber.length() != 11) {
            throw new IllegalLengthException("Pesel should be 11 digits long.");
        }
    }
}