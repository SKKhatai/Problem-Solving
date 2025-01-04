package com.practice.problem;

import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        //s1=ABCD
        //S2=CDBA this is called String rotationSuccessfull
        Scanner sc = new Scanner(System.in);
        String s1="ABCD";
        String s2="CDAB";
       if(StringRotation(s1,s2)){
           System.out.println("find Rotatted String");
       }
       else{
           System.out.println("NOt found");
       }

    }
    public static boolean StringRotation(String s1,String s2){
        return (s1.length()==s2.length()) && ((s1+s1).indexOf(s2) !=-1);
    }
}
