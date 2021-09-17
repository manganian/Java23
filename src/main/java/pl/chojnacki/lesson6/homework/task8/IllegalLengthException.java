package pl.chojnacki.lesson6.homework.task8;

public class IllegalLengthException extends RuntimeException{
    public IllegalLengthException() {};
    public IllegalLengthException(String message) {
        super(message);
    }
}
