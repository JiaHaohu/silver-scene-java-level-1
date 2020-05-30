package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PokerSorterTest {
    @Test
    void should_sort_2_elements_in_place() {
        String[] pokers = {"2", "A"};
        PokerSorter.sort(pokers);

        assertArrayEquals(
            new String[]{"A", "2"},
            pokers
        );
    }

    @Test
    void should_sort_multiple_elements_in_place() {
        String[] pokers = {"K", "2", "A", "3"};
        PokerSorter.sort(pokers);

        assertArrayEquals(
            new String[]{"A", "2", "3", "K"},
            pokers
        );
    }

    @Test
    void should_sort_whole_set() {
        String[] pokers = {"K", "2", "A", "3", "9", "10", "6", "J", "Q", "8", "5", "4", "7"};
        PokerSorter.sort(pokers);

        assertArrayEquals(
            new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"},
            pokers
        );
    }

    @Test
    void should_handle_duplications() {
        String[] pokersWithDuplication = {
            "K", "2", "A", "3", "9", "10", "9", "6", "J", "6", "Q", "8", "5", "4", "7"
        };
        PokerSorter.sort(pokersWithDuplication);

        assertArrayEquals(
            new String[]{"A", "2", "3", "4", "5", "6", "6", "7", "8", "9", "9", "10", "J", "Q", "K"},
            pokersWithDuplication
        );
    }
}