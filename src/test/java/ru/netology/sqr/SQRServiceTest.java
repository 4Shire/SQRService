package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'fromExample', 200, 300, 3",
            "'minSQR', 200, 200, 0",
            "'maxSQR', 100, 100, 1",
            "'zeroSQR', 10, 10, 0",
            "'maxAmountSQR', 100, 34359, 90",})
    void counter(String testName, int min, int max, int expected) {
        SQRService service = new SQRService();
        int actual = service.counter(min, max);
        assertEquals(expected, actual);
    }
}
