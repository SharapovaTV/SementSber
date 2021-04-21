package utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.TestСonvert.*;

class TestСonvertTest {

    @ParameterizedTest
    @ValueSource(strings = {"aaabbb"})
    void testСonvertTest(String line) {
        assertEquals("3a3b",convert(line));
    }

    @Test
    void testСonvertTest2(){

        assertEquals("Неверно переданная строка",convert(null));
    }

    @Test
    void testСonvertTest3(){

        assertEquals("Неверно переданная строка",convert(""));
    }

}