package com.yusufsoysal.algorithms.practise;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class CountPairsTest {

    @Test
    public void shouldCountPairs() {
        assertThat(CountPairs.countPairs(new int[]{1, 5, 7, -1}, 6), equalTo(2));
        assertThat(CountPairs.countPairs(new int[]{1, 5, 7, -1, 5}, 6), equalTo(3));
        assertThat(CountPairs.countPairs(new int[]{1, 1, 1, 1}, 2), equalTo(6));
        assertThat(CountPairs.countPairs(new int[]{10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1}, 11), equalTo(9));
    }

}