package com.yusufsoysal.algorithms.interview;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    private Palindrome palindrome = new Palindrome();

    @Test
    public void shouldReturnFalseForNullValue(){
        assertThat(palindrome.isPalindrome(null), CoreMatchers.equalTo(false));
    }

    @Test
    public void shouldReturnFalseForNonPalindromValue(){
        assertThat(palindrome.isPalindrome("abcdef"), CoreMatchers.equalTo(false));
    }

    @Test
    public void shouldReturnTrueForPalindromValue(){
        assertThat(palindrome.isPalindrome("level"), CoreMatchers.equalTo(true));
    }

    @Test
    public void shouldReturnTrueForPalindromValueInDifferentCases(){
        assertThat(palindrome.isPalindrome("levEL"), CoreMatchers.equalTo(true));
    }

}