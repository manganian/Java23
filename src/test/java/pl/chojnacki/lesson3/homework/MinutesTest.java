package pl.chojnacki.lesson3.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinutesTest {

    @Test
    void shouldReturn60SecondsFor1Minute() {
        //given
        int minutes = 1;
        //when
        String result = Minutes.convertMinutestoSeconds(minutes);
        //then
        Assertions.assertEquals("1 minutes equals 60 seconds.",result);
    }

    @Test
    void shouldReturn300SecondsFor5Minutes() {
        //given
        int minutes = 5;
        //when
        String result = Minutes.convertMinutestoSeconds(minutes);
        //then
        Assertions.assertEquals("5 minutes equals 300 seconds.",result);
    }

    @Test
    void shouldReturn0SecondFor0Minute() {
        //given
        int minutes = 0;
        //when
        String result = Minutes.convertMinutestoSeconds(minutes);
        //then
        Assertions.assertEquals("O minutes equals 0 seconds.",result);
    }

    @Test
    void shouldReturnEnterPositiveNumberForMinus5() {
        //given
        int minutes = -5;
        //when
        String result = Minutes.convertMinutestoSeconds(minutes);
        //then
        Assertions.assertEquals("Enter a positive number to convert it.",result);
    }

}