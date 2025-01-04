package com.practice.problem;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestUniqueSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String LongestSubstring= findUniqueSubstring(s);
        System.out.println(LongestSubstring);
        System.out.println(LongestSubstring.length());
    }
    public static String findUniqueSubstring(String s){
        Set<Character> set = new HashSet<>();
        int left=0;int maxlength=0; int startIndex=0;
        for(int right=0;right<s.length();right++){
            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));

            if(right-left+1>=maxlength){
                maxlength=right-left+1;
                startIndex=left;
            }
        }
        return s.substring(startIndex,startIndex+maxlength);
    }
}
