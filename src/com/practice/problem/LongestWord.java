package com.practice.problem;


//Questions:-Return the longest Word in the String .
//        If two or more words that are same length return
//        then return the first word from the string with that length.

//Examples/TestCases:-input:-"fun!! and time"
//                    output:-time
//                2:-input:-"I love dogs"
//                    output:-love
//                    3:-input:-my password is skk123456
//                    output:-skk123456

import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();

       String result= longestWord(str);
        System.out.println("The Longest Word is "+result+" and its length is "+result.length());
    }
    public static String longestWord(String str){
        String longestWord="";
        String currentWord="";
        int maxLength=0;
        for (int i = 0; i < str.length(); i++) {
           char ch=str.charAt(i);
           if(alphaNumeric(ch)){
               currentWord+=ch;
           }
           else {
               if(currentWord.length()>maxLength){
                   longestWord=currentWord;
                   maxLength=currentWord.length();
               }
              currentWord="";
           }
           if(currentWord.length()>maxLength){
               longestWord=currentWord;
           }
        }
        return longestWord;
    }

    public static boolean alphaNumeric(char ch){
        return (ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9');
    }


}
