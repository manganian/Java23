package pl.chojnacki.lesson10.task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;

class DateOfBirthToolsTest {

    DateOfBirthTools date = new DateOfBirthTools(LocalDate.of(2000, 6, 1));

    @Test
    void shouldVerifyAge() {
        //given, when
        int age = date.getAge();
        //then
        Assertions.assertEquals(21, age);
    }

    @Test
    void shouldVerifyWeekNumber() {
        //given, when
        int week = date.getWeek();
        //then
        Assertions.assertEquals(22, week);
    }

    @Test
    void shouldVerifyDayOfWeek() {
        //given, when
        DayOfWeek day = date.getDayOfWeek();
        //then
        Assertions.assertEquals(DayOfWeek.THURSDAY, day);
    }
}