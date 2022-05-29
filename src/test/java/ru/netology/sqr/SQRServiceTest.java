package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'from example', 200, 300, 3",
                        "'min SQRT', 200, 200, 0",
                        "'max SQRT', 100, 100, 1",
                        "'zero SQRT', 10, 10, 0",
                        "'max amount SQRT', 100, 34359, 90",
                        "'wrong amount SQRT', 200, 300, 7"})
    void counter(String testName, int min, int max, int expected) {
        SQRService service = new SQRService();
        int actual = service.counter(min, max);
        assertEquals(expected, actual);
    }
}
