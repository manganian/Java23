package pl.chojnacki.lesson7.homework.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;

import java.util.stream.Stream;

class StringCounterTest {

    @ParameterizedTest
    @MethodSource ("provideVariousTexts")
    void shouldReturnLengthOfString (String input, int expected) {
        int actualValue = StringCounter.getLengthOfText(input);
        Assertions.assertEquals(expected, actualValue);
    }

    private static Stream<Arguments> provideVariousTexts() {
        return Stream.of(
                Arguments.of("Nasa Saturn V", "13"),
                Arguments.of("Sputnik", "7"),
                Arguments.of("", "0")
        );
    }

    @ParameterizedTest
    @NullSource
    void shouldReturnZeroForNull (String input){
        //given, when
        int actual = StringCounter.getLengthOfText(input);
        int expected = 0;
        //then
        Assertions.assertEquals(expected, actual);
    }
}