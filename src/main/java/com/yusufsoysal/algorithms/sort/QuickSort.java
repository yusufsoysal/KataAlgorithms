package com.yusufsoysal.algorithms.sort;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public List<Integer> sort(List<Integer> numbers) {
        if( numbers == null ){
            return null;
        } else if(numbers.size() == 1 ){
            return numbers;
        }

        int pivot = numbers.get(0);
        List<Integer> lower = new ArrayList<>();
        List<Integer> higher = new ArrayList<>();

        for( int i = 1; i<numbers.size(); i++ ){
            Integer currentNumber = numbers.get(i);
            if( currentNumber < pivot ){
                lower.add(currentNumber);
            } else {
                higher.add(currentNumber);
            }
        }

        lower = sort(lower);
        lower.add( pivot );
        lower.addAll( sort( higher) );

        return lower;
    }


    public void sort(int[] numbers){
        if( numbers == null ){
            return;
        }

        sort(numbers, 0, numbers.length-1);
    }

    private void sort(int[] numbers, int low, int high){
        if( low >= high ){
            return;
        }

        int pivot = numbers[low];
        int i = low;
        for( int j = low+1; j<= high; j++ ){
            if( numbers[j] < pivot ){
                i++;
                swapValues(numbers, i, j);
            }
        }

        swapValues(numbers, i, low);

        sort(numbers, low, i-1);
        sort(numbers, i+1, high);
    }

    private void swapValues(int[] numbers, int i, int j) {
        int temp = numbers[j];
        numbers[j] = numbers[i];
        numbers[i] = temp;
    }

}
