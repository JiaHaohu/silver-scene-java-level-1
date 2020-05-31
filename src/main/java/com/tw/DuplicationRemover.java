package com.tw;

import java.util.*;

public class DuplicationRemover {
    /**
     * This method removes duplicated {@link String} in the collection. Please note
     * that the comparision is case insensitive. And the result should keep the
     * original order of collection.
     *
     * @param collection The collection which may contains duplication.
     * @return The collection in which each element is unique.
     */
    public static List<String> removeDuplication(List<String> collection) {
        // TODO: Please implement the method
        // <-start-
        if (collection == null) {
            return null;
        }

        HashSet<String> set = new HashSet<>(collection);

        return new ArrayList<>(set);
        // --end-->
    }

    // TODO: You can add additional method(s) if you want
    // <-start-

    // --end-->
}
