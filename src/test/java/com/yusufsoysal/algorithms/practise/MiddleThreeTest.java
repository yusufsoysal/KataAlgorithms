package com.yusufsoysal.algorithms.practise;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class MiddleThreeTest {

    private MiddleThree middleThree = new MiddleThree();

    @Test
    public void shouldReturnSameWordIfWordLengthIsLessThanThree() {
        assertThat(middleThree.middleThree("a"), equalTo("a"));
        assertThat(middleThree.middleThree("ab"), equalTo("ab"));
    }

    @Test
    public void shouldReturnTheSameWordIfLengthIsThree(){
        assertThat(middleThree.middleThree("abc"), equalTo("abc"));
    }

    @Test
    public void shouldReturnTheMiddleThreeChars(){
        assertThat(middleThree.middleThree("testing"), equalTo("sti"));
    }

}