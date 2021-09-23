package pl.chojnacki.lesson6.homework.task4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(WordFinder.searchWord("Kot"));
            System.out.println(WordFinder.searchWord("Java"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
