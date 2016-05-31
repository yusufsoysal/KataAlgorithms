package com.yusufsoysal.algorithms.interview;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * Write an algorithm that prints all numbers between 1 and n,
 * replacing multiples of 3 with the String Fizz,
 * multiples of 5 with Buzz, and multiples of 15 with FizzBuzz.
 */
public class FizzBuzz {

    public String getRepresentation(int maxNumber){
        return IntStream.rangeClosed(1, maxNumber)
                .mapToObj(this::determineValue)
                .collect(Collectors.joining(", "));
    }


    public String determineValue(int number) {
        if( number % 3 == 0 && number % 5 == 0 ){
            return "FizzBuzz";
        } else if ( number % 3 == 0 ) {
            return "Fizz";
        } else if( number % 5 == 0 ){
            return "Buzz";
        }

        return Integer.toString(number);
    }
}
