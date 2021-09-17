package pl.chojnacki.lesson5.homework.task5;

public class Bicycle implements Vehicle {

    @Override
    public void startEngine() {
        throw new UnsupportedOperationException("Bicycle does not have engine");
    }

    @Override
    public void stopEngine() {
        throw new UnsupportedOperationException("Bicycle does not have engine");
    }
}
