package com.yusufsoysal.algorithms.sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class MergeSortTest {

    private MergeSort algorithm = new MergeSort();

    @Test
    public void shouldNotFailWhenParameterIsNull() {
        List<Integer> sortedValues = algorithm.sort((List<Integer>) null);
        assertThat(sortedValues, nullValue());
    }

    @Test
    public void shouldSortListWithOneElement(){
        List<Integer> sortedValues = algorithm.sort(Arrays.asList(1));
        assertThat(sortedValues, equalTo(Arrays.asList(1)));
    }

    @Test
    public void shouldSortListWithMultipleElemenst(){
        List<Integer> sortedValues = algorithm.sort(Arrays.asList(1, 4, 3, 9, -5, 100, 8));
        assertThat(sortedValues, equalTo(Arrays.asList(-5, 1, 3, 4, 8, 9, 100)));
    }
}