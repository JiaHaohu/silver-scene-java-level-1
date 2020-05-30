package com.tw;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DuplicationRemoverTest {
    @Test
    void should_get_null_if_original_value_is_null() {
        assertNull(DuplicationRemover.removeDuplication(null));
    }

    @Test
    void should_keep_the_original_values_if_there_is_no_duplication() {
        // Given
        List<String> noDuplication = Arrays.asList("1", "2", "3");

        // When
        List<String> uniqueItems = DuplicationRemover.removeDuplication(noDuplication);

        // Then
        assertIterableEquals(noDuplication, uniqueItems);
    }

    @Test
    void should_remove_duplication() {
        // Given
        List<String> containsDuplication = Arrays.asList("Hello", "World", "Hello");

        // When
        List<String> uniqueStrings = DuplicationRemover.removeDuplication(containsDuplication);

        // Then
        assertIterableEquals(Arrays.asList("Hello", "World"), uniqueStrings);
    }

    @Test
    void should_remove_duplication_case_insensitive() {
        // Given
        List<String> containsDuplication = Arrays.asList("HELLO", "World", "hello");

        // When
        List<String> uniqueStrings = DuplicationRemover.removeDuplication(containsDuplication);

        // Then
        assertIterableEquals(
            Arrays.asList("HELLO", "World"),
            uniqueStrings
        );
    }

    @Test
    void should_remove_duplication_while_keep_the_original_order() {
        // Given
        List<String> containsDuplication = Arrays.asList("1", "2", "3", "1", "2", "3", "a", "b", "c");

        // When
        List<String> uniqueStrings = DuplicationRemover.removeDuplication(containsDuplication);

        // Then
        assertIterableEquals(
            Arrays.asList("1", "2", "3", "a", "b", "c"),
            uniqueStrings
        );
    }
}