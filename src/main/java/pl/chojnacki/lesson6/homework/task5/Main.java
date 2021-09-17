package pl.chojnacki.lesson6.homework.task5;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            TextInverter.reverseTextFromFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
