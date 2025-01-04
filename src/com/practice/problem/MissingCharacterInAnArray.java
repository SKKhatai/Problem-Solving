package com.practice.problem;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;

public class MissingCharacterInAnArray {
    public static Set<Character> findMissingCharacter(char[] arr, char start , char end){
        HashSet<Character> set1=new HashSet<>();
        for(char val:arr){
            set1.add(val);
        }
        HashSet<Character> set2= new HashSet<>();
        for(char i=start;i<end;i++){
            set2.add(i);
        }
        set2.removeAll(set1);
        return new TreeSet<>(set2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String s = sc.nextLine();
        char arr[]=s.toCharArray();
        char start=arr[0];
        char end=arr[arr.length-1];
      Set<Character> result=  findMissingCharacter(arr,start,end);
        System.out.println(result);
    }
}
