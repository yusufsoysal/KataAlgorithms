package com.yusufsoysal.algorithms.interview;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class ReverseStringTest {

    private final ReverseString reverse = new ReverseString();

    @Test
    public void shouldReturnNullWhenValueIsNull(){
        assertThat(reverse.reverse(null), nullValue());
    }

    @Test
    @Parameters({ "abc, cba",
            "qwerty, ytrewq",
            "shouldReverseString, gnirtSesreveRdluohs",
            "a, a",
            "ab, ba"
    })
    public void shouldReverseString(String value, String reversedValue){
        assertThat(reverse.reverse(value), equalTo(reversedValue));
    }

}