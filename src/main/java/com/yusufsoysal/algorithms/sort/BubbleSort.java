package com.yusufsoysal.algorithms.sort;

public class BubbleSort {

    public int[] sort(int[] numbers){
        if( numbers == null ){
            return null;
        }

        boolean numbersSwitched;
        do{
            numbersSwitched = false;
            for( int i = 0; i < numbers.length - 1; i++ ){
                if( numbers[i] > numbers[i + 1] ){
                    swapNumbers(numbers, i);
                    numbersSwitched = true;
                }
            }
        } while( numbersSwitched );


        return numbers;
    }

    private void swapNumbers(int[] numbers, int i) {
        int temp = numbers[i];
        numbers[i] = numbers[i + 1];
        numbers[i + 1] = temp;
    }

}
