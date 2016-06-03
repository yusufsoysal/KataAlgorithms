package com.yusufsoysal.algorithms.sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {


    public List<Integer> sort(List<Integer> numbers) {
        if( numbers == null ){
            return null;
        }

        int listSize = numbers.size();
        if(listSize <= 1){
            return numbers;
        }


        int middle = listSize / 2;
        List<Integer> leftList = sort( numbers.subList(0, middle) );
        List<Integer> rightList = sort( numbers.subList(middle, listSize) );

        return mergeLists(leftList, rightList);
    }

    private List<Integer> mergeLists(List<Integer> leftList, List<Integer> rightList) {
        List<Integer> mergedList = new ArrayList<>();
        int leftIndex=0;
        int rightIndex=0;
        int leftSize = leftList.size();
        int rightSize = rightList.size();

        while(leftIndex< leftSize && rightIndex< rightSize) {
            if( leftList.get(leftIndex) < rightList.get(rightIndex) ){
                mergedList.add(leftList.get(leftIndex++));
            } else {
                mergedList.add(rightList.get(rightIndex++));
            }
        }

        if( leftIndex < leftSize){
            mergedList.addAll(leftList.subList(leftIndex, leftSize));
        }

        if( rightIndex < rightSize){
            mergedList.addAll(rightList.subList(rightIndex, rightSize));
        }

        return mergedList;
    }
}
