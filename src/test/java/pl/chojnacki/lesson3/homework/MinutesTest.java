package pl.chojnacki.lesson3.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinutesTest {

    @Test
    void shouldReturn60SecondsFor1Minute() {
        //given
        int minutes = 1;
        //when
        int result = Minutes.convertMinutesToSeconds(minutes);
        //then
        Assertions.assertEquals(60,result);
    }

    @Test
    void shouldReturn300SecondsFor5Minutes() {
        //given
        int minutes = 5;
        //when
        int result = Minutes.convertMinutesToSeconds(minutes);
        //then
        Assertions.assertEquals(300,result);
    }

    @Test
    void shouldReturn0SecondFor0Minute() {
        //given
        int minutes = 0;
        //when
        int result = Minutes.convertMinutesToSeconds(minutes);
        //then
        Assertions.assertEquals(0,result);
    }

    @Test
    void shouldReturnEnterPositiveNumberForMinus5() {
        //given
        int minutes = -5;
        //when
        int result = Minutes.convertMinutesToSeconds(minutes);
        //then
        Assertions.assertEquals(0,result);
    }
}