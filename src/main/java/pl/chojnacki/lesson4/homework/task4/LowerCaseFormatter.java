package pl.chojnacki.lesson4.homework.task4;

public class LowerCaseFormatter implements TextFormatter {

    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
