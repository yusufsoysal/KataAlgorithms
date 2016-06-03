package com.yusufsoysal.algorithms.interview;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    private final Palindrome palindrome = new Palindrome();

    @Test
    public void shouldReturnFalseForNullValue(){
        assertThat(palindrome.isPalindrome(null), CoreMatchers.equalTo(false));
    }

    @Test
    public void shouldReturnFalseForNonPalindromeValue(){
        assertThat(palindrome.isPalindrome("abcdef"), CoreMatchers.equalTo(false));
    }

    @Test
    public void shouldReturnTrueForPalindromeValue(){
        assertThat(palindrome.isPalindrome("level"), CoreMatchers.equalTo(true));
    }

    @Test
    public void shouldReturnTrueForPalindromeValueInDifferentCases(){
        assertThat(palindrome.isPalindrome("levEL"), CoreMatchers.equalTo(true));
    }

}