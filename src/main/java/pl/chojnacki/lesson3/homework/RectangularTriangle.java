package pl.chojnacki.lesson3.homework;

public class RectangularTriangle {
    public static boolean isTriangleRectangular(double sideA, double sideB, double sideC) {
        return sideA * sideA + sideB * sideB == sideC * sideC && sideA > 0 && sideB > 0 && sideC > 0;
    }
}
