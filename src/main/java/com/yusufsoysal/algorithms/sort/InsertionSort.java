package com.yusufsoysal.algorithms.sort;

import java.util.LinkedList;
import java.util.List;

public class InsertionSort {
    public List<Integer> sort(List<Integer> numbers) {
        if( numbers == null ){
            return numbers;
        }

        List<Integer> newList = new LinkedList<>();

        for( int number : numbers ){
            boolean numberCouldNotBeAdded = true;
            for( int i = 0; i < newList.size(); i++ ) {
                if( number < newList.get(i) ){
                    newList.add(i, number);
                    numberCouldNotBeAdded = false;
                    break;
                }
            }

            if( numberCouldNotBeAdded ){
                newList.add(number);
            }

        }

        return newList;
    }
}
