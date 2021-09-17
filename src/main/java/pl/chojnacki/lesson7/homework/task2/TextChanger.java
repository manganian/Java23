package pl.chojnacki.lesson7.homework.task2;

public class TextChanger {
    public static String changeTextToUpperCase(String text) {
        if (text == null) {
            return "";
        }
        return text.toUpperCase();
    }
}
