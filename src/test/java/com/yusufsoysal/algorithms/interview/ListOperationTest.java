package com.yusufsoysal.algorithms.interview;

import com.yusufsoysal.algorithms.interview.ListOperation.AddOneOperation;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ListOperationTest {

    private ListOperation listOperation = new ListOperation();

    @Test
    public void shouldAddOneNumberToAllElements(){
        List<Integer> initial = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> returned = listOperation.operate(initial, new AddOneOperation());
        assertThat(returned, CoreMatchers.equalTo(Arrays.asList(2, 3, 4, 5, 6)));
    }

    @Test
    public void shouldReturnNullIfValueIsNull(){
        List<Integer> returned = listOperation.operate(null, new AddOneOperation());
        assertThat(returned, CoreMatchers.nullValue());
    }

}