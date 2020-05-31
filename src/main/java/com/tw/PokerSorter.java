package com.tw;

import java.util.Arrays;
import java.util.HashMap;

public class PokerSorter {
    /**
     * This method sorts the pokers according to the following order:
     * <p>
     * A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K
     * <p>
     * Please note we will be sure to provide correct input. So argument checking
     * can be omitted.
     *
     * @param pokers The poker values.
     */
    public static void sort(String[] pokers) {
        // TODO: Please implement the method
        // <-start-
        if (pokers == null || pokers.length <= 1) {
            return;
        }

        String[] orders = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        HashMap<String, Integer> posMap = new HashMap<>();

        for (int i = 0; i < orders.length; i++) {
            posMap.put(orders[i], i);
        }

        int[] indexArray = new int[pokers.length];

        for (int i = 0; i < pokers.length; i++) {
            indexArray[i] = posMap.get(pokers[i]);
        }

        Arrays.sort(indexArray);


        for (int i = 0; i < indexArray.length; i++) {
            pokers[i] = orders[indexArray[i]];
        }

        // --end-->
    }

    // TODO: You can add additional method(s) or field(s) if you want
    // <-start-


    // --end-->
}
