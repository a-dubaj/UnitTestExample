package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MonthsSimpleTest {
    List<String> months = new Months().months();

    @Test
    void monthsTest() {
        assertEquals("January", months.get(0), "Error in month I");
        assertEquals("February", months.get(1), "Error in month II");
        assertEquals("March", months.get(2), "Error in month III");
        assertEquals("April", months.get(3), "Error in month IV");
        assertEquals("May", months.get(4), "Error in month V");
        assertEquals("June", months.get(5), "Error in month VI");
        assertEquals("July", months.get(6), "Error in month VII");
        assertEquals("August", months.get(7), "Error in month VIII");
        assertEquals("September", months.get(8), "Error in month IX");
        assertEquals("October", months.get(9), "Error in month X");
        assertEquals("November", months.get(10), "Error in month XI");
        assertEquals("December", months.get(11), "Error in month XII");
    }

    @Test
    void monthTestInvalidMonth() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            months.get(-1);
        });
    }

    @Test
    void monthTestDoesNotThrow() {
        Assertions.assertDoesNotThrow(() -> {
            months.get(1);
        });
    }
}