package com.yusufsoysal.algorithms.interview;

/*
 * How do you test if a word is a palindrome?
 */
public class Palindrome {

    public boolean isPalindrome(String word) {
        if( word == null ){
            return false;
        }

        char[] chars = word.toCharArray();
        int startChar = -1;
        int endChar = chars.length;

        boolean cont;
        char firstCharacter;
        char lastCharacter;

        do {
            startChar++;
            while( !Character.isLetter( chars[ startChar ] ) ){
                startChar++;
            }

            endChar--;
            while( !Character.isLetter( chars[ endChar ] ) ){
                endChar--;
            }

            firstCharacter = Character.toLowerCase(chars[ startChar ]);
            lastCharacter = Character.toLowerCase(chars[ endChar ]);

            cont =  firstCharacter == lastCharacter;

        } while( cont && startChar < endChar );

        return cont;
    }
}
