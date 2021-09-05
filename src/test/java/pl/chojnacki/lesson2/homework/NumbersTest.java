package pl.chojnacki.lesson2.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumbersTest {

    @Test
    void shouldReturnNumberIsEvenWhenEnter4() {
        //given
        int number = 4;
        //when
        boolean result = Numbers.checkNumberIsEven(number);
        //then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldReturnNumberIsOddWhenEnter11() {
        //given
        int number = 11;
        //when
        boolean result = Numbers.checkNumberIsEven(number);
        //then
        Assertions.assertFalse(result);
    }

    @Test
    void shouldReturnEnterANumberBetweenWhenEnter0() {
        //given
        int number = 0;
        //when
        boolean result = Numbers.checkNumberIsEven(number);
        //then
        Assertions.assertFalse(result);
    }

    @Test
    void shouldReturnEnterANumberBetweenWhenEnterMinus256() {
        //given
        int number = -256;
        //when
        boolean result = Numbers.checkNumberIsEven(number);
        //then
        Assertions.assertFalse(result);
    }
}