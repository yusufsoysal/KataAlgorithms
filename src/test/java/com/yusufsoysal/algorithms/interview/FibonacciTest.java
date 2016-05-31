package com.yusufsoysal.algorithms.interview;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();

    @Test
    public void shouldReturnEmptyListIfNumberIsNegative(){
        assertThat(fibonacci.calculate(-1), CoreMatchers.equalTo(Collections.EMPTY_LIST));
    }

    @Test
    public void shouldReturnEmptyListIfNumberIsZero(){
        assertThat(fibonacci.calculate(0), CoreMatchers.equalTo(Collections.EMPTY_LIST));
    }

    @Test
    public void shouldReturnOneIfNumberIsOne(){
        assertThat(fibonacci.calculate(1), CoreMatchers.equalTo(Arrays.asList(0)));
    }

    @Test
    public void shouldReturnOneAndTwoIfNumberIsTwo(){
        assertThat(fibonacci.calculate(2), CoreMatchers.equalTo(Arrays.asList(0, 1)));
    }

    @Test
    public void shouldReturnFibonacciNumbers(){
        List<Integer> fibonacciNumbers = fibonacci.calculate(10);

        assertThat(fibonacciNumbers, CoreMatchers.equalTo(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34)));
    }

}