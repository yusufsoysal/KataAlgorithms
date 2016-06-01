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
        assertThat( fizzBuzz.determineValue(number), equalTo(Integer.toString(number)) );
    }

    @Test
    @Parameters({"3","6", "9", "12", "18", "21", "24", "27"})
    public void shouldReturnFizzWhenParameterIsDividableBy3AndNotBy5(int number){
        assertThat( fizzBuzz.determineValue(number), equalTo("Fizz") );
    }

    @Test
    @Parameters({"5", "10", "20", "25", "35", "40", "50"})
    public void shouldReturnBuzzWhenParameterIsDividableBy5AndNotBy3(int number){
        assertThat( fizzBuzz.determineValue(number), equalTo("Buzz") );
    }

    @Test
    @Parameters({"15", "30", "45", "60", "75", "90"})
    public void shouldReturnFizzBuzzWhenParameterIsDividableBy3And5(int number){
        assertThat( fizzBuzz.determineValue(number), equalTo("FizzBuzz") );
    }

    @Test
    public void shouldReplaceAllValues(){
        assertThat(fizzBuzz.getRepresentation(20), equalTo("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz"));
    }

    @Test
    public void shouldReturnEmptyStringIfValueIsNegative(){
        assertThat(fizzBuzz.getRepresentation(-1), equalTo(""));
    }

    @Test
    public void shouldReturnEmptyStringIfValueIsZero(){
        assertThat(fizzBuzz.getRepresentation(0), equalTo(""));
    }

}