package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CharSearcherTest {
    private static CharSearcher charSearcher;

    @BeforeAll
    public static void setup() {
        charSearcher = new CharSearcher(new char[]{'a', 'b', 'c', 'd'});
    }

    @Test
    public void getCharPositionTest() {
        //given
        char firstArg = 'b';
        char secondArg = 'g';
        //when
        int result1 = charSearcher.getCharPosition(firstArg);
        int result2 = charSearcher.getCharPosition(secondArg);
        //then
        Assertions.assertNotEquals(-1, result1);
        Assertions.assertNotEquals(-1, result2);
    }
}
