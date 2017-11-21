package com.yusufsoysal.algorithms.codechallenge.arraysLeftRotation;

import java.util.Scanner;

public class LeftRotation {

    public static int[] rotateArray(int[] numbers, int rotationCount) {
        // to keep the original array untouched
        int length = numbers.length;
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            int index = (i + rotationCount) % length;
            if (index < 0) {
                index += length;
            }
            array[i] = numbers[index];
        }

        return array;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfElements = in.nextInt();
        int rotationCount = in.nextInt();
        int array[] = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = in.nextInt();
        }

        array = rotateArray(array, rotationCount);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
