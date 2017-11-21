package com.yusufsoysal.algorithms.search;

public class BinarySearch {

    public int search(int[] numbers, int value){
        int first = 0;
        int last = numbers.length-1;

        while( first <= last ){
            int midPoint = (first + last) / 2;
            int midNumber = numbers[midPoint];

            if(midNumber == value){
                return midPoint;
            }

            if(midNumber > value) {
                last = midPoint - 1;
            } else {
                first = midPoint + 1;
            }
        }

        return -1;
    }

}
