package pl.chojnacki.lesson4.homework.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UpperCaseFormatterTest {

    @Test
    void shouldReturnUpperCase () {
        //given
        UpperCaseFormatter upperCaseFormatter = new UpperCaseFormatter();
        String text = "Lorem IPSUM dolor.";
        //when
        String result = upperCaseFormatter.formatText(text);
        //then
        Assertions.assertEquals("LOREM IPSUM DOLOR.", result);
    }
}