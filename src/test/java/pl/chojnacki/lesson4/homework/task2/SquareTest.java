package pl.chojnacki.lesson4.homework.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void shouldAreaEquals25WhenSideIs5() {
        //given
        Square square = new Square(5);
        //when
        double result = square.calculateArea();
        //then
        Assertions.assertEquals(25, result);
    }

    @Test
    void shouldPerimeterEquals20WhenSideIs5() {
        //given
        Square square = new Square(5);
        //when
        double result = square.calculatePerimeter();
        //then
        Assertions.assertEquals(20, result);
    }

}