package com.practice.problem;

import java.util.Scanner;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        int max=0;
        String s2="";
        for(int i=0;i<s.length();i++){
            String temp="";
            temp=temp+s.charAt(i);
            for(int j=i+1;j<s.length();j++){
                temp=temp+s.charAt(j);
                    if(checkPalindrome(temp) && temp.length()>=max){
                        max=temp.length();
                        s2=temp;
                    }
            }

        }
        System.out.println(s2);
    }
    public static boolean checkPalindrome(String s){
        int start=0;
        int end=s.length()-1;
        boolean flag=true;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                flag=false;
                break;
            }
            start++;
            end--;
        }
       return flag;
    }
}
