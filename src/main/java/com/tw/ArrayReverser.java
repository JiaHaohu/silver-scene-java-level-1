package com.tw;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayReverser {
    /**
     * This method reverse each element of the array and returns a reversed new array.
     * Please note that the original array should be considered as immutable.
     *
     * @param array The original array.
     * @return The reversed array.
     */
    public static int[] reverse(int[] array) {
        // TODO: Please implement the method
        // <-start-
        if (array == null || array.length == 0 || array.length == 1) {
            return array;
        }

        int[] reverseArray = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[(array.length - 1) - i] = array[i];
        }

        return reverseArray;
        // --end-->
    }

    // TODO: You can add additional method(s) if you want
    // <-start-

    // --end-->
}
