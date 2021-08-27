package pl.chojnacki.lesson2.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.chojnacki.lesson2.homework.DaysOfWeek;

class DaysOfWeekTest {

    @Test
    void shouldReturnMondayWhenDayOfWeekIs1() {
        String result = DaysOfWeek.printDayOfWeek(1);
        Assertions.assertEquals ("Monday",result);
    }

    @Test
    void shouldReturnWeekendWhenDayOfWeekIs6() {
        String result = DaysOfWeek.printDayOfWeek(6);
        Assertions.assertEquals ("Weekend",result);
    }

    @Test
    void shouldReturnNoDayWhenDayOfWeekIs69() {
        String result = DaysOfWeek.printDayOfWeek(69);
        Assertions.assertEquals ("There is no such a day!",result);
    }

    @Test
    void shouldReturnNoDayWhenDayOfWeekIsMinus7() {
        String result = DaysOfWeek.printDayOfWeek(-7);
        Assertions.assertEquals ("There is no such a day!",result);
    }

}