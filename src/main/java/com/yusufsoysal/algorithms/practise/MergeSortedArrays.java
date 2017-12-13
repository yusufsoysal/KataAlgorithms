package com.yusufsoysal.algorithms.practise;

public class MergeSortedArrays {

    /**
     * Merging two sorted arrays
     */
    public static int[] mergeArrays(int[] array1, int[] array2) {
        if (array1 == null) {
            return array2;
        } else if (array2 == null) {
            return array1;
        }

        int[] result = new int[array1.length + array2.length];

        int index = 0;
        int i = 0, j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                result[index++] = array1[i++];
            } else {
                result[index++] = array2[j++];
            }
        }

        while (i < array1.length) {
            result[index++] = array1[i++];
        }

        while (j < array2.length) {
            result[index++] = array2[j++];
        }

        return result;
    }

}
