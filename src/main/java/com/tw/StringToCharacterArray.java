package com.tw;

public class StringToCharacterArray {
    /**
     * This methods turns a {@link String} instance to character array.
     *
     * @param text The {@link String} instance.
     * @return A character array contains characters in text.
     */
    public static char[] toArray(String text) {
        // TODO: Please implement the method
        // <-start-
        if (text == null || text.length() == 0) {
            return new char[0];
        }
        return text.toCharArray();
        // --end-->
    }

    /**
     * This methods turns a {@link String} instance to an int array. Please note
     * that each integer element is a character rather than a code point.
     *
     * @param text The {@link String} instance.
     * @return A integer array contains characters in text.
     */
    public static int[] toIntArray(String text) {
        // TODO: Please implement the method
        // <-start-
        throw new RuntimeException("Delete me");
        // --end-->
    }
}
