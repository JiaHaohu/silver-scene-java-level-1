package com.tw;

import java.util.Map;

public class CharacterReplacement {
    /**
     * This method replace characters appears in text with another character. The replacement
     * rules are defined in a {@link Map}. The key of the {@link Map} is the original character
     * and the value of the {@link Map} is the replacement.
     *
     * @param text           The original {@link String}.
     * @param replacingRules The replace rules.
     * @return The replaced {@link String}.
     */
    public static String replaceCharacters(String text, Map<Character, Character> replacingRules) {
        // TODO: Please implement the method
        // <-start-
        if (replacingRules == null || replacingRules.isEmpty()) {
            return text;
        }
        throw new RuntimeException("Delete me");
        // --end-->
    }

    // TODO: You can add additional method(s) if you want
    // <-start-

    // --end-->
}
