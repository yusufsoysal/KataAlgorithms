package com.yusufsoysal.algorithms.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Write a method that returns a Fibonacci sequence from 1 to n
 */
public class Fibonacci {
    public List calculate(int number) {
        List<Integer> fibonacciNumbers = new ArrayList<>(Arrays.asList(0, 1));

        if( number <= 0 ){
            return Collections.EMPTY_LIST;
        } else if( number <= 2 ){
            return fibonacciNumbers.subList(0, number);
        }

        for( int i = 2; i<number; i++ ){
            int newNumber = fibonacciNumbers.get(i-2) + fibonacciNumbers.get(i-1);
            fibonacciNumbers.add(newNumber);
        }

        return fibonacciNumbers;
    }
}
