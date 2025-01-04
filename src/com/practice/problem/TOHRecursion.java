package com.practice.problem;

import java.util.Scanner;


public class TOHRecursion {
    public static void TOH(int n,int a,int b,int c){
        if(n>0){
            TOH(n-1,a,c,b);
            System.out.println("Move a disc from"+a+ "to"+c);
            TOH(n-1,b,a,c);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        TOH(n,1,2,3);
    }
}
