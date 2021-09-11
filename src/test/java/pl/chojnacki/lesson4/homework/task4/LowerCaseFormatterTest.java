package pl.chojnacki.lesson4.homework.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LowerCaseFormatterTest {

    @Test
    void shouldReturnLowerCase () {
        //given
        LowerCaseFormatter lowerCaseFormatter = new LowerCaseFormatter();
        String text = "Lorem IPSUM dolor.";
        //when
        String result = lowerCaseFormatter.formatText(text);
        //then
        Assertions.assertEquals("lorem ipsum dolor.", result);
    }
}