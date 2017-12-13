package com.yusufsoysal.algorithms.practise;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class MergeSortedArraysTest {

    @Test
    public void shouldMergeSortedArrays() {
        int[] array1 = new int[]{0, 5, 6, 9, 13, 34};
        int[] array2 = new int[]{3, 7, 10, 12, 15, 23};

        assertThat(MergeSortedArrays.mergeArrays(array1, array2), equalTo(new int[]{0, 3, 5, 6, 7, 9, 10, 12, 13, 15, 23, 34}));
    }

    @Test
    public void shouldReturnSecondArrayIfFirstOneIsNull(){
        int[] array2 = new int[]{3, 7, 10, 12, 15, 23};

        assertThat(MergeSortedArrays.mergeArrays(null, array2), equalTo(new int[]{3, 7, 10, 12, 15, 23}));
    }

    @Test
    public void shouldReturnFirstArrayIfSecondOneIsNull() {
        int[] array1 = new int[]{0, 5, 6, 9, 13, 34};

        assertThat(MergeSortedArrays.mergeArrays(array1, null), equalTo(new int[]{0, 5, 6, 9, 13, 34}));
    }

    @Test
    public void shouldWorkForZeroLengthArrays() {
        int[] array1 = new int[]{0, 5, 6, 9, 13, 34};
        int[] array2 = new int[0];

        assertThat(MergeSortedArrays.mergeArrays(array1, array2), equalTo(new int[]{0, 5, 6, 9, 13, 34}));
    }

}