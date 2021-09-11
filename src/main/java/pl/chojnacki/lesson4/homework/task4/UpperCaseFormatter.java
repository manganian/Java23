package pl.chojnacki.lesson4.homework.task4;

public class UpperCaseFormatter implements TextFormatter {

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
