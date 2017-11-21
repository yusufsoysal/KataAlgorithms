package com.yusufsoysal.algorithms.practise;

public class MiddleThree {

    /**
     Given a string of odd length, return the middle 3 characters from the string,
     so the string <b>"Monitor"</b> yields <b>"nit"</b>.
     If the string length is less than 3, return the string as is. <br> <br>

     <b>EXPECTATIONS:</b><br>
     middleThree("bunny") <b>---></b> "unn" <br>
     middleThree("peter") <b>---></b> "ete" <br>
     middleThree("Jamaica") <b>---></b>"mai" <br>
     */
    public String middleThree(String word){
        int length = word.length();

        if( length < 3 ){
            return word;
        }

        int middleIndex = length / 2;

        return word.substring(middleIndex-1, middleIndex+2);
    }

    public static void run(String str){
        int maximumTotal = 0;
        int currentTotal = 1;
        char previousChar = Character.MIN_VALUE;

        for (char currentChar : str.toCharArray()) {
            if( previousChar == currentChar ){
                currentTotal++;
            } else {
                if( currentTotal > maximumTotal ){
                    maximumTotal = currentTotal;
                }

                currentTotal = 1;
            }
            previousChar = currentChar;
        }

        if( currentTotal > 0 && currentTotal > maximumTotal ){
            maximumTotal = currentTotal;
        }


        System.out.println(maximumTotal);
    }

    public static void main(String[] args) {
        run("hayyeu");
        run("XPNzzzdd000000xx");
        run("");
    }
}
