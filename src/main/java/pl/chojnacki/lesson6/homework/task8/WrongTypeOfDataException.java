package pl.chojnacki.lesson6.homework.task8;

public class WrongTypeOfDataException extends RuntimeException{
    public WrongTypeOfDataException() {};
    public WrongTypeOfDataException(String message) {
        super(message);
    }
}

