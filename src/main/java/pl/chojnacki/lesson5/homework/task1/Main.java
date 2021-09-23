package pl.chojnacki.lesson5.homework.task1;

public class Main {
    public static void main(String[] args) {

        String text = "Ululani na lulu";

        if (!TextChecker.isEmpty(text)) {
            System.out.println("Is it a palindrome? " + TextChecker.isPalindrome(text));
            System.out.println("Text length: " + TextChecker.checkLengthOfText(text));
        }
    }
}
