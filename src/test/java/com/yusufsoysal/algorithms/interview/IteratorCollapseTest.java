package com.yusufsoysal.algorithms.interview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class IteratorCollapseTest {

    private final IteratorCollapse collapser = new IteratorCollapse();

    @Test
    public void shouldReturnEmptyIteratorWhenValueIsNull(){
        Iterator<String> iterator = collapser.singleIterator(null);
        assertThat(iterator.hasNext(), equalTo(false));
    }

    @Test
    public void shouldReturnIteratorWhenOnlyOneIteratorSupplied(){
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        Iterator<Integer> iterator = integerList.iterator();

        Iterator<Integer> returnedIterator = collapser.singleIterator(iterator);

        int currentIndex = 0;
        while( returnedIterator.hasNext() ){
            assertThat(returnedIterator.next(), equalTo( integerList.get(currentIndex++) ));
        }

        assertThat(currentIndex, equalTo(5));
    }

    @Test
    public void shouldReturnIteratorWhenMoreThanOneIteratorSupplied(){
        List<List<Integer>> integerList = new ArrayList<>();
        integerList.add( Arrays.asList(1, 2, 3, 4, 5) );
        integerList.add( Arrays.asList(6, 7, 8, 9) );
        integerList.add( Arrays.asList(10, 11, 12) );

        Iterator<Integer> iterator1 = integerList.get(0).iterator();
        Iterator<Integer> iterator2 = integerList.get(1).iterator();
        Iterator<Integer> iterator3 = integerList.get(2).iterator();

        Iterator<Integer> returnedIterator = collapser.singleIterator(iterator1, iterator2, iterator3);

        int currentIndex = 0;
        int totalValue = 0;
        int listIndex = 0;
        while( returnedIterator.hasNext() ){
            List<Integer> currentList = integerList.get(listIndex);

            assertThat(returnedIterator.next(), equalTo( currentList.get(currentIndex++) ));
            if( currentIndex >= currentList.size() ){
                listIndex++;
                currentIndex = 0;
            }
            ++totalValue;
        }

        assertThat(totalValue, equalTo(12));
    }

}