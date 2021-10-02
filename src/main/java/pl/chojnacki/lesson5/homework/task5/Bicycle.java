package pl.chojnacki.lesson5.homework.task5;

public class Bicycle implements Vehicle {

    @Override
    public void turnLeft() {
        System.out.println("Stick out your left arm and point left.");
    }

    @Override
    public void turnRight() {
        System.out.println("Stick out your right arm and point right.");
    }
}
