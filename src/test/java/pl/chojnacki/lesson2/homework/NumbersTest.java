package pl.chojnacki.lesson2.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumbersTest {

    @Test
    void shouldReturnNumberIsEvenWhenEnter4() {
        //given
        int number = 4;
        //when
        String result = Numbers.checkNumberIsEven(number);
        //then
        Assertions.assertEquals("A number is even.",result);
    }

    @Test
    void shouldReturnNumberIsOddWhenEnter11() {
        //given
        int number = 11;
        //when
        String result = Numbers.checkNumberIsEven(number);
        //then
        Assertions.assertEquals("A number is odd.", result);
    }

    @Test
    void shouldReturnEnterANumberBetweenWhenEnter0() {
        //given
        int number = 0;
        //when
        String result = Numbers.checkNumberIsEven(number);
        //then
        Assertions.assertEquals("Enter a number between 1 and 2 147 483 647",result);
    }

    @Test
    void shouldReturnEnterANumberBetweenWhenEnterMinus256() {
        //given
        int number = -256;
        //when
        String result = Numbers.checkNumberIsEven(number);
        //then
        Assertions.assertEquals("Enter a number between 1 and 2 147 483 647",result);
    }
}