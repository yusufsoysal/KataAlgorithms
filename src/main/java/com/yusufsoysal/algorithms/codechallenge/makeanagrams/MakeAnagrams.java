package com.yusufsoysal.algorithms.codechallenge.makeanagrams;

import java.util.Scanner;

public class MakeAnagrams {
    public static int numberNeeded(String first, String second) {

        int counts[] = new int[26];

        for (char c : first.toCharArray()) {
            counts[c - 'a']++;
        }

        for (char c : second.toCharArray()) {
            counts[c - 'a']--;
        }

        int numberOfChars = 0;
        for (int count : counts) {
            numberOfChars += Math.abs(count);
        }

        return numberOfChars;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }

}
