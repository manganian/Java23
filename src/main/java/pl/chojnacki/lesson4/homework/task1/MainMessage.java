package pl.chojnacki.lesson4.homework.task1;


import java.sql.SQLOutput;

public class MainMessage {
    public static void main(String[] args) {
        WindowMessage windowMessage = new WindowMessage();
        System.out.println(windowMessage.getMessage());
        ConsoleMessage consoleMessage = new ConsoleMessage();
        System.out.println(consoleMessage.getMessage());
    }
}
