package com.practice.DSA;

import java.util.HashSet;

public class Longest_Unique_SubStr {
    public static void main(String[] args) {
        String s="kjdlkjdkkkkdjjdskskshelopwq";
       int []arr= getLongestSubstr(s);
       for(int i=arr[0];i<=arr[1];i++){
           System.out.print(s.charAt(i));
       }
    }
    public static int[] getLongestSubstr(String str){
        int start=0;
        int end=0;int max=0;
        HashSet<Character> set = new HashSet<>();
        String concat="";
       while(end<str.length()){
           if(!set.contains(str.charAt(end))){
               concat+=str.charAt(end);
               set.add(str.charAt(end));
               max=Math.max(max,set.size());
               end++;
           }
           else{
               start++;
             set.remove(str.charAt(start));

           }
       }
       int arr[]={start,end-1};
       return arr;
    }
}
