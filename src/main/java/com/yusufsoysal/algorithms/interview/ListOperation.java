package com.yusufsoysal.algorithms.interview;

import java.util.List;
import java.util.stream.Collectors;

/*
 * Write a method that replicates a list of Integers, with 1 added to each element.
 */
public class ListOperation {
    public <T> List<T> operate(List<T> initial, Operation<T> operation) {
        if( initial == null ){
            return null;
        }

        return initial.stream()
                .map(operation::operate)
                .collect(Collectors.toList());
    }

    interface Operation<T> {
        T operate( T value );
    }

    static class AddOneOperation implements Operation<Integer> {

        @Override
        public Integer operate(Integer value) {
            return value + 1;
        }
    }
}
