package com.yusufsoysal.algorithms.codechallenge.arraysLeftRotation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class LeftRotationTest {

    @Test
    public void rotateArray() {
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        assertThat(LeftRotation.rotateArray(numbers, 1), equalTo(new int[]{2, 3, 4, 5, 1}));
        assertThat(LeftRotation.rotateArray(numbers, 2), equalTo(new int[]{3, 4, 5, 1, 2}));
        assertThat(LeftRotation.rotateArray(numbers, 3), equalTo(new int[]{4, 5, 1, 2, 3}));
        assertThat(LeftRotation.rotateArray(numbers, 4), equalTo(new int[]{5, 1, 2, 3, 4}));
        assertThat(LeftRotation.rotateArray(numbers, 5), equalTo(new int[]{1, 2, 3, 4, 5}));
        assertThat(LeftRotation.rotateArray(numbers, 12), equalTo(new int[]{3, 4, 5, 1, 2}));
    }

}