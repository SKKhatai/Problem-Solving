package com.practice.DSA;

import java.util.HashMap;

public class Highest_Frequency_Character {
   public static void findHighestFreq(char []arr){
       HashMap<Character,Integer> map= new HashMap<>();

       for(int i=0;i<arr.length;i++){
           char ch=arr[i];
           if(map.containsKey(ch)==true){
               int freq=map.get(arr[i]);
               map.put(arr[i],freq+1);
           }
           else{
               map.put(arr[i],1);
           }
       }
       for(Character key:map.keySet()){
           System.out.println(key+":"+map.get(key));
       }
       int maxfreq=0;
       char maxfreqchar='a';
       for(Character key2:map.keySet()){
           if(map.get(key2)>maxfreq){
               maxfreq=map.get(key2);
               maxfreqchar=key2;
           }
       }
       System.out.println(maxfreqchar+" Has max Freq of "+maxfreq);
   }

    public static void main(String[] args) {
        String s="aabaabyrttttttcdbacbd";
        char c[]=s.toCharArray();
        findHighestFreq(c);
    }
}
