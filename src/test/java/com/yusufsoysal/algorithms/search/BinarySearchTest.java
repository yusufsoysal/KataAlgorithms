package com.yusufsoysal.algorithms.search;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class BinarySearchTest {
    private BinarySearch binarySearch = new BinarySearch();

    @Test
    public void shouldFindNumber() {
        int[] numbers = {-5, 1, 3, 4, 9, 32, 100, 238};
        assertThat(binarySearch.search(numbers, 3), equalTo(2));
        assertThat(binarySearch.search(numbers, -5), equalTo(0));
        assertThat(binarySearch.search(numbers, 100), equalTo(6));
    }

    @Test
    public void shouldReturnMinusOne(){
        int[] numbers = {-5, 1, 3, 4, 9, 32, 100, 238};
        assertThat(binarySearch.search(numbers, 300), equalTo(-1));
    }

}