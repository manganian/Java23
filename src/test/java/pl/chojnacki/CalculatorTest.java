package pl.chojnacki;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.chojnacki.lesson2.homework.Calculator;

class CalculatorTest {

    @Test
    void shouldReturn5WhenAdd2To3() {

      int value1 = 2;
      int value2 = 3;

      int result = Calculator.sum(value1, value2);

      Assertions.assertEquals(5,result);
    }
}