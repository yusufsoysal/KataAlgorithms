package com.yusufsoysal.algorithms.interview;

import com.yusufsoysal.algorithms.interview.ReverseLinkedList.MyLinkedList;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class ReverseLinkedListTest {

    private final ReverseLinkedList reverse = new ReverseLinkedList();

    @Test
    public void shouldReturnSameLinkedListIfThereIsOnlyOneItem() {
        MyLinkedList<String> linkedList = new MyLinkedList<>("Item1");
        assertThat(reverse.reverse(linkedList), equalTo(new MyLinkedList<>("Item1")));
    }

    @Test
    public void shouldReturnReverseLinkedList(){
        MyLinkedList<String> item1 = new MyLinkedList<>("Item1");
        MyLinkedList<String> item2 = new MyLinkedList<>("Item2");
        MyLinkedList<String> item3 = new MyLinkedList<>("Item3");
        MyLinkedList<String> item4 = new MyLinkedList<>("Item4");
        MyLinkedList<String> item5 = new MyLinkedList<>("Item5");

        item1.setNext(item2);
        item2.setNext(item3);
        item3.setNext(item4);
        item4.setNext(item5);


        MyLinkedList<String> item1Copy = new MyLinkedList<>("Item1");
        MyLinkedList<String> item2Copy = new MyLinkedList<>("Item2");
        MyLinkedList<String> item3Copy = new MyLinkedList<>("Item3");
        MyLinkedList<String> item4Copy = new MyLinkedList<>("Item4");
        MyLinkedList<String> item5Copy = new MyLinkedList<>("Item5");

        item5Copy.setNext(item4Copy);
        item4Copy.setNext(item3Copy);
        item3Copy.setNext(item2Copy);
        item2Copy.setNext(item1Copy);

        assertThat( reverse.reverse(item1), equalTo(item5Copy) );
    }

}