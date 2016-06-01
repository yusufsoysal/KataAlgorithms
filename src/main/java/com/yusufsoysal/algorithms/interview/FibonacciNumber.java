package com.yusufsoysal.algorithms.interview;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumber {

    private Map<Integer,Integer> cache = new HashMap<>();

    public int calculate(int number) {
        if( number <= 0 ){
            return -1;
        } else if (number < 3) {
            return number - 1;
        }

        Integer preCalculatedvalue = cache.get(number);
        if( preCalculatedvalue != null ){
            return preCalculatedvalue;
        }

        int calculatedValue = calculate(number - 1) + calculate(number - 2);
        cache.put(number, calculatedValue);

        return calculatedValue;
    }
}
