package pl.chojnacki.lesson3.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangularTriangleTest {

    @Test
    void shouldReturnTrueWhenSidesAreThreeFourAndFive() {
        //given
        double A = 3;
        double B = 4;
        double C = 5;
        //when
        boolean result = RectangularTriangle.isTriangleRectangular(A,B,C);
        //then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenSidesAreThreedotThreeAndFourAndFive() {
        //given
        double A = 3.3;
        double B = 4;
        double C = 5;
        //when
        boolean result = RectangularTriangle.isTriangleRectangular(A,B,C);
        //then
        Assertions.assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenSidesAreMinusSevendotThreeAndFourAndFive() {
        //given
        double A = -7.3;
        double B = 4;
        double C = 5;
        //when
        boolean result = RectangularTriangle.isTriangleRectangular(A,B,C);
        //then
        Assertions.assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenSidesAreZero() {
        //given
        double A = 0;
        double B = 0;
        double C = 0;
        //when
        boolean result = RectangularTriangle.isTriangleRectangular(A,B,C);
        //then
        Assertions.assertFalse(result);
    }
}