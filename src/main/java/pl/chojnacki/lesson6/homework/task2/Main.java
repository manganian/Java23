package pl.chojnacki.lesson6.homework.task2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            LineDisplay.display();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
