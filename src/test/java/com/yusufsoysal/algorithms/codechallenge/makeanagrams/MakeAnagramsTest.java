package com.yusufsoysal.algorithms.codechallenge.makeanagrams;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MakeAnagramsTest {

    @Test
    public void shouldReturnNumberOfCharactersRemoval(){
        Assert.assertThat(MakeAnagrams.numberNeeded("abc", "cde"), CoreMatchers.equalTo(4));
        Assert.assertThat(MakeAnagrams.numberNeeded("bacdc", "dcbad"), CoreMatchers.equalTo(2));
        Assert.assertThat(MakeAnagrams.numberNeeded("arraysleft", "telefax"), CoreMatchers.equalTo(7));
    }

}