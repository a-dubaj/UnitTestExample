package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MonthsTest {

    @Test
    void testDays() {
        List<String> months = new Months().months();
        Assertions.assertAll(
                () -> Assertions.assertEquals("January", months.get(0), "Error"),
                () -> Assertions.assertEquals("February", months.get(1), "Error"),
                () -> Assertions.assertEquals("March", months.get(2), "Error"),
                () -> Assertions.assertEquals("April", months.get(3), "Error"),
                () -> Assertions.assertEquals("May", months.get(4), "Error"),
                () -> Assertions.assertEquals("June", months.get(5), "Error"),
                () -> Assertions.assertEquals("July", months.get(6), "Error"),
                () -> Assertions.assertEquals("August", months.get(7), "Error"),
                () -> Assertions.assertEquals("September", months.get(8), "Error"),
                () -> Assertions.assertEquals("October", months.get(9), "Error"),
                () -> Assertions.assertEquals("November", months.get(10), "Error"),
                () -> Assertions.assertEquals("December", months.get(11), "Error")
        );
    }
}