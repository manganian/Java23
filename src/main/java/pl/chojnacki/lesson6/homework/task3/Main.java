package pl.chojnacki.lesson6.homework.task3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(CharacterCounter.countCharactersInFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
