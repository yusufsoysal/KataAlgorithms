package com.yusufsoysal.algorithms.interview;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    @Parameters({"1", "2", "4", "7", "8", "11", "13", "14", "16", "17", "19"})
    public void shouldReturnNumberWhenParameterIsNotDividableBy3Or5(int number){
        assertThat( Integer.toString(number), equalTo(fizzBuzz.determineValue(number)) );
    }

    @Test
    @Parameters({"3","6", "9", "12", "18", "21", "24", "27"})
    public void shouldReturnFizzWhenParameterIsDividableBy3AndNotBy5(int number){
        assertThat( "Fizz", equalTo(fizzBuzz.determineValue(number)) );
    }

    @Test
    @Parameters({"5", "10", "20", "25", "35", "40", "50"})
    public void shouldReturnBuzzWhenParameterIsDividableBy5AndNotBy3(int number){
        assertThat( "Buzz", equalTo(fizzBuzz.determineValue(number)) );
    }

    @Test
    @Parameters({"15", "30", "45", "60", "75", "90"})
    public void shouldReturnFizzBuzzWhenParameterIsDividableBy3And5(int number){
        assertThat( "FizzBuzz", equalTo(fizzBuzz.determineValue(number)) );
    }

    @Test
    public void shouldReplaceAllValues(){
        assertThat("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz", equalTo(fizzBuzz.getRepresentation(20)));
    }

    @Test
    public void shouldReturnEmptyStringIfValueIsNegative(){
        assertThat("", equalTo(fizzBuzz.getRepresentation(-1)));
    }

    @Test
    public void shouldReturnEmptyStringIfValueIsZero(){
        assertThat("", equalTo(fizzBuzz.getRepresentation(0)));
    }

}