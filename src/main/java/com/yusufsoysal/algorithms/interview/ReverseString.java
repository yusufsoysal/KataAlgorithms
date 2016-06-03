package com.yusufsoysal.algorithms.interview;

/*
 * Write a method to reverse a String.
 */
public class ReverseString {

    public String reverse(String value) {
        if( value == null ){
            return null;
        }

        char[] chars = value.toCharArray();
        for(int i = 0; i<chars.length/2; i++){
            char tmp = chars[i];
            int otherEnd = chars.length - i - 1;

            chars[i] = chars[otherEnd];
            chars[otherEnd] = tmp;
        }

        return new String(chars);
    }
}
