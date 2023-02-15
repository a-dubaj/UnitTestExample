package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MyFirstParametrizedTest {

    @DisplayName("Should pass a non-null message to our test method")
    @ParameterizedTest
    @ValueSource(strings = {"Hello", "World", "d", "abc", "cde", "fgh", "jgjghj"})
    void shouldPassNonNullMessageAsMethodParameter(String message) {
        assertNotNull(message);
        assertTrue(!message.isEmpty());
    }
}