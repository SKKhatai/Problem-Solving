package com.practice.problem;

public class CharacterCount {
    public static void main(String args[]){
      int  a=20;
      int b=40;
        System.out.println(a+" "+b);
        a=a^b;
        System.out.println(a+" "+b);
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);
    }
}
