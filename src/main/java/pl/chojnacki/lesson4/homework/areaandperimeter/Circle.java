package pl.chojnacki.lesson4.homework.areaandperimeter;

public class Circle implements AreaAndPerimeter {
    private double radius;
    private final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI*Math.pow(radius,2);
    }

    @Override
    public double calculatePerimeter() {
        return 2*PI*radius;
    }
}
