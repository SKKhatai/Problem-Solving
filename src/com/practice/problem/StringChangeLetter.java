package com.practice.problem;

import java.util.Scanner;

//questions:take the string replace every letter in the string with the letter
//following it in the alphabet (c becomes d,z becomes a).Then capitalize
//every vowel in this new String (a,e,i,o,u) and finally modify the modified string.
//Input:-"hello*3"
//Output:-"Ifmmp*3"
//example 2:-
//Input:"fun times!"
//Output:"gvO Ujnft!"
public class StringChangeLetter {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
        System.out.println(letterChanges(str));


    }
    public static String letterChanges(String str){
       String result="";
       char arr[]=str.toCharArray();
       for(char ch:arr){
           if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
              char newchar=shiftCharacter(ch);
              result+=convertVowel(newchar);
           }
           else {
               result+=ch;
           }
       }
       return result;
    }

    public static char shiftCharacter(char ch){
        if(ch=='z'){
            return 'a';
        }
        if(ch=='Z'){
            return 'A';
        }
        return (char)(ch+1);
    }

    public static char convertVowel(char ch){
       switch (ch){
           case 'a':
               return 'A';
           case 'e':
               return 'E';
           case 'i':
                return 'I';
           case 'o':
               return 'O';
           case 'u':
                return 'U';
           default:
               return ch;
       }
    }
}
