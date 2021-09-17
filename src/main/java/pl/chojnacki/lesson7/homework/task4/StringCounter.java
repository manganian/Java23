package pl.chojnacki.lesson7.homework.task4;

public class StringCounter {
    public static int getLengthOfText(String text) {
        if (text == null) {
            return 0;
        }
        return text.length();
    }
}
