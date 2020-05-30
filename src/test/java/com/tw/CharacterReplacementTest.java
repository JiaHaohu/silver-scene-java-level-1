package com.tw;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CharacterReplacementTest {
    @Test
    void should_return_original_string_if_no_rule_is_given() {
        final String original = "original";
        assertEquals(original, CharacterReplacement.replaceCharacters(original, null));
        assertEquals(original, CharacterReplacement.replaceCharacters(original, Collections.emptyMap()));
    }

    @Test
    void should_return_null_if_original_string_is_null() {
        assertNull(CharacterReplacement.replaceCharacters(null, null));
        assertNull(CharacterReplacement.replaceCharacters(null, Collections.emptyMap()));

        Map<Character, Character> rules = new HashMap<>();
        rules.put('a', 'b');
        assertNull(CharacterReplacement.replaceCharacters(null, rules));
    }

    @Test
    void should_replace_using_only_one_rule() {
        String original = "abc aaa";
        Map<Character, Character> replaceAWithB = new HashMap<>();
        replaceAWithB.put('a', 'b');
        assertEquals("bbc bbb", CharacterReplacement.replaceCharacters(original, replaceAWithB));
    }

    @Test
    void should_replace_using_multiple_non_conflict_rules() {
        String original = "abc aaa";
        Map<Character, Character> multipleRules = new HashMap<>();
        multipleRules.put('a', 'b');
        multipleRules.put('c', 'd');
        assertEquals("bbd bbb", CharacterReplacement.replaceCharacters(original, multipleRules));
    }

    @Test
    void should_replace_using_multiple_conflict_rules() {
        String original = "abc aaa";
        Map<Character, Character> multipleRules = new HashMap<>();
        multipleRules.put('a', 'b');
        multipleRules.put('b', 'c');
        multipleRules.put('c', 'a');
        assertEquals("bca bbb", CharacterReplacement.replaceCharacters(original, multipleRules));
    }
}