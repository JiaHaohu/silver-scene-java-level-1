package com.tw;

import java.util.Arrays;

public class StringToParts {
    /**
     * This method split comma separated string into parts. Trimming each part
     * and remove all empty parts.
     *
     * @param text The text to split.
     * @return The splitted text.
     */
    public static String[] split(String text) {
        // TODO: Please implement the method
        // <-start-
        if (text == null || text.length() == 0) {
            return new String[0];
        }
        return Arrays.stream(text.split(",")).map(String::trim).toArray(String[]::new);
        // --end-->
    }

    // TODO: You can add additional method(s) or field(s) if you want
    // <-start-

    // --end-->
}
