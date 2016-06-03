package com.yusufsoysal.algorithms.sort;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {

    private final BubbleSort algorithm = new BubbleSort();

    @Test
    public void shouldNotFailWhenParameterIsNull() {
        int[] sortedValues = algorithm.sort(null);
        assertThat(sortedValues, nullValue());
    }

    @Test
    public void shouldSortArrayWithOneElement(){
        int[] sortedValues = algorithm.sort(new int[]{1});
        assertThat(sortedValues, equalTo(new int[]{1}));
    }

    @Test
    public void shouldSortArrayWithMultipleElements(){
        int[] sortedValues = algorithm.sort(new int[]{1, 4, 3, 9, -5, 100, 8});
        assertThat(sortedValues, equalTo(new int[]{-5, 1, 3, 4, 8, 9, 100}));
    }

}