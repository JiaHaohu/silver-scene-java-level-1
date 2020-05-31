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

        HashMap<String, String> map = new HashMap<>();


        List<String> list = new ArrayList<>();

        for (String s : collection) {
            if (!contained(map, s)) {
                list.add(s);
            }
        }

        return list;
        // --end-->
    }


    // TODO: You can add additional method(s) if you want
    // <-start-

    private static boolean contained(HashMap<String, String> map, String s) {

        if (map.containsKey(s.toLowerCase())) {
            return true;
        } else {
            map.put(s.toLowerCase(), s);
            return false;
        }
    }

    // --end-->
}
