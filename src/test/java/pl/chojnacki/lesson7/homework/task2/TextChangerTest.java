package pl.chojnacki.lesson7.homework.task2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;


class TextChangerTest {
    @ParameterizedTest
    @ValueSource(strings = {"rAdar", "anna", "kaYak", "wow"})
    void shouldReturnUpperCase (String input) {
    //given, when
    String expected = input.toUpperCase();
    String actual = TextChanger.changeTextToUpperCase(input);
    //then
    Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldReturnEmptyString(String input) {
        //given, when
        String expected = "";
        String actual = TextChanger.changeTextToUpperCase(input);
        //then
        Assertions.assertEquals(expected, actual);
    }

}