package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayReverserTest {
    @SuppressWarnings("ConstantConditions")
    @Test
    public void should_get_original_array_if_original_array_is_null_or_empty() {
        final int[] nullArray = null;
        final int[] emptyArray = new int[0];

        assertNull(ArrayReverser.reverse(nullArray));
        assertSame(emptyArray, ArrayReverser.reverse(emptyArray));
    }

    @Test
    public void should_do_nothing_if_array_contains_one_element() {
        // Given
        int[] oneElementArray = { 1 };

        // When
        int[] reversed = ArrayReverser.reverse(oneElementArray);

        // Then
        assertArrayEquals(oneElementArray, reversed);
    }

    @Test
    public void should_reverse_array() {
        // Given
        int[] array = {1, 2, 3, 4, 5, 6};

        // When
        int[] reversed = ArrayReverser.reverse(array);

        // Then
        assertArrayEquals(
            new int[] {6, 5, 4, 3, 2, 1},
            reversed
        );
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Test
    public void should_leave_original_array_unchanged() {
        // Given
        int[] array = {1, 2, 3, 4, 5, 6};

        // When
        ArrayReverser.reverse(array);

        // Then
        assertArrayEquals(
            new int[] {1, 2, 3, 4, 5, 6},
            array
        );
    }
}