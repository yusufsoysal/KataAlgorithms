package com.yusufsoysal.algorithms.practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountPairs {

    /**
     * Given an array of integers, and a number ‘sum’, find the number of pairs of integers in the array whose sum is equal to ‘sum’.

     Examples:
     Input  :  arr[] = {1, 5, 7, -1},
     sum = 6
     Output :  2
     Pairs with sum 6 are (1, 5) and (7, -1)

     Input  :  arr[] = {1, 5, 7, -1, 5},
     sum = 6
     Output :  3
     Pairs with sum 6 are (1, 5), (7, -1) &
     (1, 5)

     Input  :  arr[] = {1, 1, 1, 1},
     sum = 2
     Output :  6
     There are 3! pairs with sum 2.

     Input  :  arr[] = {10, 12, 10, 15, -1, 7, 6,
     5, 4, 2, 1, 1, 1},
     sum = 11
     Output :  9
     Expected time complexity O(n)
     */

    public static int countPairs(int[] numbers, int sum){
        Map<Integer, List<Integer>> values = new HashMap<>();
        int count = 0;

        for (int number : numbers) {
            List<Integer> value = values.getOrDefault(number, new ArrayList<>());
            count+= value.size();

            value = values.getOrDefault(sum-number, new ArrayList<>());
            value.add(number);

            values.put(sum-number, value);
        }

        return count;
    }

}
