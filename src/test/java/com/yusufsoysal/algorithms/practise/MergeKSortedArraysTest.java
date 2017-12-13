package com.yusufsoysal.algorithms.practise;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class MergeKSortedArraysTest {

    @Test
    public void shouldMergeThreeArrays() {
        int[] array1 = new int[]{2, 6, 18, 97};
        int[] array2 = new int[]{5, 7, 25, 34};
        int[] array3 = new int[]{0, 1, 43, 56};

        int[] expected = {0, 1, 2, 5, 6, 7, 18, 25, 34, 43, 56, 97};
        assertThat(MergeKSortedArrays.merge(array1, array2, array3), equalTo(expected));
    }

    @Test
    public void shouldMergeFourArrays() {
        int[] array1 = new int[]{2, 6, 18, 97};
        int[] array2 = new int[]{5, 7, 25, 34};
        int[] array3 = new int[]{0, 1, 43, 56};
        int[] array4 = new int[]{-3, 12, 32, 65};

        int[] expected = {-3, 0, 1, 2, 5, 6, 7, 12, 18, 25, 32, 34, 43, 56, 65, 97};
        assertThat(MergeKSortedArrays.merge(array1, array2, array3, array4), equalTo(expected));
    }

    @Test
    public void shouldWorkForArbitraryNumberOfElements() {
        int[] array1 = new int[]{2, 6, 18, 97};
        int[] array2 = new int[]{5, 7, 25};
        int[] array3 = new int[]{0, 1};

        int[] expected = {0, 1, 2, 5, 6, 7, 18, 25, 97};
        assertThat(MergeKSortedArrays.merge(array1, array2, array3), equalTo(expected));
    }

    @Test
    public void shouldWorkForZeroLengthArrays() {
        int[] array1 = new int[0];
        int[] array2 = new int[0];
        int[] array3 = new int[0];

        int[] expected = {};
        assertThat(MergeKSortedArrays.merge(array1, array2, array3), equalTo(expected));
    }

}