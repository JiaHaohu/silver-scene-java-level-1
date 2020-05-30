package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringToCharacterArrayTest {
    @Test
    void should_turn_string_to_array() {
        String text = "Hello World";
        char[] array = StringToCharacterArray.toArray(text);

        assertArrayEquals(
            new char[] {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'},
            array
        );
    }

    @Test
    void should_return_empty_array_if_string_is_null() {
        char[] array = StringToCharacterArray.toArray(null);
        assertEquals(0, array.length);
    }

    @Test
    void should_return_empty_array_if_string_is_empty() {
        char[] array = StringToCharacterArray.toArray("");
        assertEquals(0, array.length);
    }

    @Test
    void should_turn_string_to_int_array() {
        String text = "Hello World";
        int[] array = StringToCharacterArray.toIntArray(text);

        assertArrayEquals(
            new int[] {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'},
            array
        );
    }

    @Test
    void should_return_empty_int_array_if_string_is_null() {
        int[] array = StringToCharacterArray.toIntArray(null);
        assertEquals(0, array.length);
    }

    @Test
    void should_return_empty_int_array_if_string_is_empty() {
        int[] array = StringToCharacterArray.toIntArray("");
        assertEquals(0, array.length);
    }
}
