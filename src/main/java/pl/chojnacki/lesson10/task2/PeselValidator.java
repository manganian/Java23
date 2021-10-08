package pl.chojnacki.lesson10.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeselValidator {
    public static boolean validatePesel (String pesel) {

        Pattern pattern = Pattern.compile("\\d{11}");
        Matcher matcher = pattern.matcher(pesel);

        return matcher.matches();
    }
}
