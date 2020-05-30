package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringToPartsTest {
    @Test
    void should_get_empty_string_array_if_input_is_null_or_empty() {
        assertEquals(
            0,
            StringToParts.split(null).length
        );
        assertEquals(
            0,
            StringToParts.split("").length
        );
    }

    @Test
    void should_turn_string_to_parts_by_comma_character() {
        String[] parts = StringToParts.split("name,age,year of birth,title");
        assertArrayEquals(
            new String[] {"name", "age", "year of birth", "title"},
            parts
        );
    }

    @Test
    void should_trim_each_part() {
        String[] parts = StringToParts.split("name, age, year of birth , title");
        assertArrayEquals(
            new String[] {"name", "age", "year of birth", "title"},
            parts
        );
    }

    @Test
    void should_remove_empty_part() {
        String[] parts = StringToParts.split("name,  ,, age, year of birth , title");
        assertArrayEquals(
            new String[] {"name", "age", "year of birth", "title"},
            parts
        );
    }
}
