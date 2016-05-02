package com.yusufsoysal.algorithms.sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class InsertionSortTest {

    private InsertionSort algorithm = new InsertionSort();

    @Test
    public void shouldNotFailWhenParameterIsNull() {
        List<Integer> sortedValues = algorithm.sort(null);
        assertThat(sortedValues, nullValue());
    }

    @Test
    public void shouldSortArrayWithOneElement(){
        List<Integer> sortedValues = algorithm.sort(Arrays.asList(1));
        assertThat(sortedValues, equalTo(Arrays.asList(1)));
    }

    @Test
    public void shouldSortArrayWithMultipleElemenst(){
        List<Integer> sortedValues = algorithm.sort(Arrays.asList(1, 4, 3, 9, -5, 100, 8));
        assertThat(sortedValues, equalTo(Arrays.asList(-5, 1, 3, 4, 8, 9, 100)));
    }
}