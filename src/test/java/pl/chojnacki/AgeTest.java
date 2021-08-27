package pl.chojnacki;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.chojnacki.lesson2.homework.Age;

class AgeTest {

    @Test
    void shouldReturnBelow18WhenAgeIs10 () {
        String verification = Age.ageVerification(10);
        Assertions.assertEquals("Your age is below 18.",verification);
    }

    @Test
    void shouldReturnAbove18WhenAgeIs22 () {
        String verification = Age.ageVerification(25);
        Assertions.assertEquals("Your age is 18 or above 18.",verification);
    }
}