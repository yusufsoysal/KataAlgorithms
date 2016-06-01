package com.yusufsoysal.algorithms.interview;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class FibonacciNumberTest {

    private FibonacciNumber fibonacciCalculator = new FibonacciNumber();

    @Test
    @Parameters({
            "1, 0",
            "2, 1",
            "3, 1",
            "4, 2",
            "5, 3",
            "6, 5",
            "7, 8",
            "8, 13",
            "9, 21",
            "10, 34"
    })
    public void shouldReturnFibonacciNumber(int number, int fibonacciNumber){
        assertThat( fibonacciCalculator.calculate(number), equalTo(fibonacciNumber) );
    }

    @Test
    public void shouldReturnMinus1IfNumberIsNegative(){
        assertThat(fibonacciCalculator.calculate(-5), equalTo(-1));
    }

    @Test
    public void shouldReturnMinus1IfNumberIsZero(){
        assertThat(fibonacciCalculator.calculate(0), equalTo(-1));
    }

}