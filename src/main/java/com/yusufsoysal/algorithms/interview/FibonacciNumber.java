package com.yusufsoysal.algorithms.interview;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumber {

    private final Map<Integer,Integer> cache = new HashMap<>();

    public int calculate(int number) {
        if( number <= 0 ){
            return -1;
        } else if (number < 3) {
            return number - 1;
        }

        Integer preCalculatedValue = cache.get(number);
        if( preCalculatedValue != null ){
            return preCalculatedValue;
        }

        int calculatedValue = calculate(number - 1) + calculate(number - 2);
        cache.put(number, calculatedValue);

        return calculatedValue;
    }
}
